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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode leftCur = list1;
        ListNode rightCur = list2;
        ListNode resPrev = new ListNode();
        ListNode res = resPrev;

        while(leftCur != null && rightCur != null) {
            if(leftCur.val >= rightCur.val) {
                res.next = rightCur;
                rightCur = rightCur.next;
            } else {
                res.next = leftCur;
                leftCur = leftCur.next;
            }
            res = res.next;
        }

        if(leftCur != null) {
            res.next = leftCur;
        }

        if(rightCur != null) {
            res.next = rightCur;
        } 

        return resPrev.next;
    }
}