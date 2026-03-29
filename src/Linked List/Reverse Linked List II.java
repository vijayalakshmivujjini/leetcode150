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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode current=head;
        for(int i=0;i<left-1;i++){
            current=current.next;
            prev=prev.next;
        }
        ListNode subHead=current;
        ListNode subprev=null;
        for(int i=0;i<right-left+1;i++){
            ListNode next=current.next;
            current.next=subprev;
            subprev=current;
            current=next;
        }

        prev.next=subprev;
        subHead.next=current;

        return dummy.next;
    }
}