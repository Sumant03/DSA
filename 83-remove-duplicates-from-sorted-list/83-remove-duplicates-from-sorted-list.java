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
        ListNode dh=new ListNode(Integer.MAX_VALUE);
        ListNode dt=dh;
        
        ListNode temp=head;

        while(temp!=null){
        
            if(dt.val==temp.val){
                temp=temp.next;
            }else{
               dt.next=temp;
                dt=dt.next;
                temp=temp.next;
            }
            
            
        }
        dt.next=null;
        return dh.next;
    }
}