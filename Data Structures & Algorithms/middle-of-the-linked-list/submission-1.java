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
    public ListNode middleNode(ListNode head) {
        // ListNode cur = head;
        // int length = 0;

        // while(cur != null) {
        //     length+=1;
        //     cur = cur.next;
        // }

        // length = length / 2;
        
        // cur = head;
        // while(length > 0) {
        //     cur = cur.next;
        //     length-=1;
        // }
        // return cur;
        ListNode speed1 = head;
        ListNode speed2 = head;

        while(speed2 != null && speed2.next != null) {
            speed1 = speed1.next;
            speed2 = speed2.next.next;
        }

        return speed1;

    }
}