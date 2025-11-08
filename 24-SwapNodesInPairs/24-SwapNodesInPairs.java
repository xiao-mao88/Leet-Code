// Last updated: 11/8/2025, 2:03:36 PM
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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode result = new ListNode(0);
    ListNode curr = result;
    while (head != null) {
      ListNode temp = head.next;
      if (head.next != null && temp.next != null) {
        head.next = temp.next;
        temp.next = head;
        curr.next = temp;
        curr = curr.next.next;
      }
      else if (head.next != null) {
        head.next = null;
        temp.next = head;
        curr.next = temp;
        curr = curr.next;
      }
      head = head.next;
    }
    return result.next;
    }
}