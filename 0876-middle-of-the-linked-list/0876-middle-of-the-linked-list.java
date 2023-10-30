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
        int length = 1;
        int half;
        int cur = 0;
        ListNode h;
        h = head;
        
        // 리스트의 길이 구하기
        while (h.next != null) {
            h = h.next;
            length++;
        }

        half = length / 2;
        while (cur < half) {
                cur++;
                head = head.next;
            }
        return head;

    }
}