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
    
     public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
        return true;
    }

    ListNode slow = head;
    ListNode fast = head;
    // fast.next ---> for even list
    // fast.next.next ---> for odd list
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    slow.next = reverse(slow.next); // here we get the mid+1 of the LL  for reverse
    slow = slow.next; // this slow points to next of the mid of the list
    while (slow != null) {
        if (head.val != slow.val) {
            return false;
        }
        head = head.next;
        slow = slow.next;
    }
    return true;
}

     public ListNode reverse(ListNode head) {
    ListNode prev = null, nxt = null;
    while (head != null) {
        nxt = head.next;
        head.next = prev;
        prev = head;
        head = nxt;
    }
    return prev;
}
}