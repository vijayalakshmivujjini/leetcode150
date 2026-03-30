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
    public ListNode partition(ListNode head, int x) {
        ListNode leftList=new ListNode();
        ListNode rightList=new ListNode();

        ListNode left=leftList;
        ListNode right=rightList;

        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                left.next=curr;
                left=left.next;
            }else{
                right.next=curr;
                right=right.next;
            }
            curr=curr.next;
        }
        right.next=null;
        left.next=rightList.next;


        return leftList.next;
    }
}