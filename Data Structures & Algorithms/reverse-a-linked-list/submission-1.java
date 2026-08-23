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
    public ListNode reverseList(ListNode head) {
        //about 3 minutes. LinkedList is always hard for me, to visualize this links and relink nodes
        ListNode prev = null;
        ListNode cur = head;
        
        while(cur != null) {
            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
