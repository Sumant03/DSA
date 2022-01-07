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
        ListNode dh=new ListNode(0);
        ListNode dt=dh;
        
        ListNode temp=head;
        dt.next=head;
        dt=dt.next;
        temp=temp.next;
        
        while(temp!=null){
            System.out.println("[1,1]");
            if(temp.val!=dt.val){
                ListNode node=new ListNode(temp.val);
                dt.next=node;
                dt=dt.next;
                System.out.println("[1,1]again");
            }
            
            temp=temp.next;
        }
        dt.next=null;
        return dh.next;
    }
}