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
    
    static int size;
    
    static ListNode leftNode;
          

    
    public boolean IsPalindromeHelper(ListNode node,int idx){
        
        if(node==null){
            return true;
        }
        
       boolean ans= IsPalindromeHelper(node.next,idx+1);
        if(idx>=size/2){
            ListNode right=node;
            
            if(right.val!=leftNode.val){
                return false;
            }
            leftNode=leftNode.next;
            
        }
        
        return ans;
    }
         
    
    
    public boolean isPalindrome(ListNode head) {
             size=0;
             ListNode temp=head;
             while(temp!=null){
                 temp=temp.next;
                 size++;
             }
             
             leftNode =head;
             return IsPalindromeHelper(head,1);
    }
}