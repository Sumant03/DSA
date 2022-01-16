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
    public static int count(ListNode head){
        ListNode temp=head;
        int count=0;
        
        
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null){
            return null;
        }
        int count=count(head);
        if(n==count){
            return head.next;
        }
        
        ListNode temp=head;
        ListNode p=head;
        ListNode dh=new ListNode(-1);
        ListNode dt=dh;
        
        while(n-->0){
            temp=temp.next;
        }
        
        while(temp!=null){
            dt.next=p;
            dt=dt.next;
            
            p=p.next;
            temp=temp.next;
        }
        
        ListNode pn=p.next;
        
          dt.next=pn;
        
        return head;
        
    }
}