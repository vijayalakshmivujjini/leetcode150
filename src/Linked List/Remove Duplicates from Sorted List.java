/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE); //if we assign a 0 it will break an edge case of list starting with 0;
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null){
            if(prev.val==curr.val){
                curr=curr.next;
                prev.next=curr;
//continue; // jumps back to while(curr != null), below code shouldnt be executed if "if condiiton satifies" , we can write else also
            }else{
                prev=curr;
                curr=curr.next;}
        }return dummy.next;


    }
}
