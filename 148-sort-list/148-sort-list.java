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
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    
    private ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode middleNode = findMiddleNode(head);
        ListNode nextToMiddleNode = middleNode.next;
        
        middleNode.next = null;
        
        ListNode leftNode = mergeSort(head);
        ListNode rightNode = mergeSort(nextToMiddleNode);
        
        return mergeTwoSortedList(leftNode, rightNode);
    }
    
    private ListNode mergeTwoSortedList(ListNode leftNode, ListNode rightNode) {
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        
        while(leftNode != null && rightNode != null) {
            if(leftNode.val <= rightNode.val) {
                currentNode.next = leftNode;
                leftNode = leftNode.next;
                currentNode = currentNode.next;
            } else {
                currentNode.next = rightNode;
                rightNode = rightNode.next;
                currentNode = currentNode.next;
            }
        }
        
        while(leftNode != null) {
            currentNode.next = leftNode;
            leftNode = leftNode.next;
            currentNode = currentNode.next;
        }
        
        while(rightNode != null) {
            currentNode.next = rightNode;
            rightNode = rightNode.next;
            currentNode = currentNode.next;
        }
        
        return head.next;
    }
    
    private ListNode findMiddleNode(ListNode head) {
        if(head == null) {
            return head;
        }
        
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        
        while(fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        return slowPtr;
    }
}