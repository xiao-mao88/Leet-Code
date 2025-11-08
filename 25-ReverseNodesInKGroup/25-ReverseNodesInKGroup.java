// Last updated: 11/8/2025, 2:03:35 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
            if (head==null || head.next == null || k == 1) return head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode temp = head;
    int count = 1;
    ListNode first = temp;
    while (head != null) {
      if (count % k == 0) {
        ListNode next = head.next;
        head.next = null;
        if (count / k == 1) {
          dummy.next = reverseListNodes(temp);
        }
        else {
          first.next = reverseListNodes(temp);
          first = temp;
        }
        temp = next;
        head = next;
      }
      else {
        head = head.next;
      }
      count++;
    }
    first.next = temp;
    return dummy.next;
    }

      public ListNode reverseListNodes(ListNode head) {
    ListNode result = new ListNode(0);
    while (head != null) {
      ListNode currNode = head;
      head = head.next;
      currNode.next = result.next;
      result.next = currNode;
    }
    return result.next;
  }
}