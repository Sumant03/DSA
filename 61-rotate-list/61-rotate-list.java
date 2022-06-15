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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null||head.next==null||k==0){
            return head;
        }
        
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        // System.out.println(length);
        temp.next=head;
        // System.out.println(temp.val);
        k=k%length;
        
        int val=length-k;
        // System.out.println(val);
        
        ListNode ans=null;
        while(val-->0){
            temp=temp.next;
        }
        ans=temp.next;
        temp.next=null;
        
        // System.out.println(ans.val);
        return ans;
        
    }
}