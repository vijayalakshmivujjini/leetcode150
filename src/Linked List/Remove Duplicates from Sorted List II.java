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
        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null){
            if(curr.val==curr.next.val){
                int dup=curr.val;// save the duplicate and loop until its skipped
                while(curr.val==dup){ // skip whole zone of duplicates
                    curr=curr.next;
                }
                prev.next=curr; //relink

            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}

// | |                           LC 83                              | LC 82 |
// |---|---|---|
// | **Question asked** | "Did I already see this value?" | "Is this value about to repeat?" |
// | **Look direction** | Backwards — `prev.val == curr.val` | Forwards — `curr.val == curr.next.val` |
// | **On duplicate** | Skip one node | Skip entire zone |
// | **`prev` moves when** | Every unique node | Only confirmed clean nodes |
// | **Head can be removed?** | No — head is always kept | Yes — dummy node essential |
// | **Duplicates kept** | One copy kept | Zero copies kept |