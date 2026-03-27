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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode fast=dummy;
        ListNode slow=dummy;

        for(int i=0;i<=n;i++){ // this makes fast move ahead of  n+1 steps
            fast=fast.next;
        }

        while(fast!=null){ //each moves a step forwad until fast is null
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next; //skip the element and point to next element
        return dummy.next;
    }
}