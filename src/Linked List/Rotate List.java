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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int n=0;
        ListNode count=head;
        while(count!=null){
            n++; // needed to avoaid TLE
            count=count.next;
        }
        k=k%n;
        for(int i=0;i<k;i++){
            ListNode curr=head;
            while(curr.next.next!=null){ //stop at second-to-last
                curr=curr.next;
            }
            ListNode last=curr.next; //grab last node
            curr.next=null; //assign null to second last
            last.next=head; // add last before first elemeny
            head=last; //add head to last

        }
        return head;

    }
}