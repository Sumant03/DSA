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
    public ListNode swapNodes(ListNode head, int k) {
        
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode p1=head;
        ListNode p2=head;
        
        int val=k;
        
        while(val-->0){
            temp=temp.next;
        }
        
        while(temp!=null){
            temp=temp.next;
            p1=p1.next;
        }
        
        while(k-->1){
            p2=p2.next;
        }
        
        
        int t=p1.val;
        p1.val=p2.val;
        p2.val=t;
        
        return head;
    }
}