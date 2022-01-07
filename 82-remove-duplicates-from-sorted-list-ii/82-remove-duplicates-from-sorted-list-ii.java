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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        
        ListNode dh=new ListNode (-1);
        ListNode dt=dh;
        
        ListNode itr=head;
        ListNode curr=itr.next;
        dt.next=itr;
        
        
        
        while(curr!=null){
            boolean isDuplicate=false;
            
            while(curr!=null&&itr.val==curr.val){
                isDuplicate=true;
                curr=curr.next;
                    
            }
            
        if(isDuplicate){
            dt.next=curr;
        
        }else{
            
            dt=dt.next;
        }   
            
            itr=curr;
            
            if(itr != null)
            curr = itr.next;
            
        }
        return dh.next;
        
    }
}