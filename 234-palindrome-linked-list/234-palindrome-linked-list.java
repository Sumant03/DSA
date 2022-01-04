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
    
         public ListNode reverseList(ListNode head) {
        
        ListNode curr=head;
        ListNode prev=null;
        
        while(curr!=null){
            //backup
            ListNode n=curr.next;
            
            //connection
           
            curr.next=prev;
                
                //move;
                 prev=curr;
                curr=n;
                
            
        }
        return prev;
        
    }
    
    
         public ListNode middleNode(ListNode head) {
         if(head==null){
             return head;
         }
           
           
            ListNode fast=head;
            ListNode slow=head;
            
            while(fast.next!=null&&fast.next.next!=null){
                
                fast=fast.next.next;
                slow=slow.next;
                
            }
            return slow;
        
    }
    
    
         public boolean isPalindrome(ListNode head) {
        
        ListNode mid=middleNode(head);
        ListNode nh=mid.next;
        
        
        mid.next=null;
        
        ListNode rh=reverseList(nh);
        ListNode lh=head;
        
        while(rh!=null){
            
            if(lh.val!=rh.val){
                return false;
            }
            lh=lh.next;
            rh=rh.next;
        }
        return true;
    }
}