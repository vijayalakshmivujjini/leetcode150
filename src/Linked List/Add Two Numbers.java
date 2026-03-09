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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // if sum=19 then carry will be 1
            current.next = new ListNode(sum % 10); // current.next will be assigned to 9
            current = current.next;
        }

        return dummy.next; //dummy → 8 → 9 → 0 by saying dummy.next list start at 8
    }
}
// dummy
// ^
// current

// dummy->8 at step 31
// ^
// current

// dummy->8 at step 32
//         ^
//         current