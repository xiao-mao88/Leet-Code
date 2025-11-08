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
      public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    }
    ListNode dummyHead = lists[0];
    for (int i = 1; i < lists.length; i++) {
      dummyHead = mergeTwoLists(dummyHead, lists[i]);
    }
    return dummyHead;
  }

  private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyHead = new ListNode(0);
    ListNode curr = dummyHead;
    if (list2 == null) {
      return list1;
    }
    else if (list1 == null) {
      return list2;
    }
    while(list1 != null && list2 != null) {
      if(list1.val <= list2.val) {
        curr.next = list1;
        list1 = list1.next;
      }
      else {
        curr.next = list2;
        list2 = list2.next;
      }
      curr = curr.next;
    }
    if(list1 != null) {
      curr.next = list1;
    }
    if(list2 != null) {
      curr.next = list2;
    }
    return dummyHead.next;
  }
}