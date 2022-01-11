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
    public ListNode reverseKGroup(ListNode head, int k) {
         //1->2->3->4->5        k=2;   
     
        
        
        int size=size(head);
           if(k>size||k==0){
            return head;
        }
        ListNode oh=null;
        ListNode ot=null;
        ListNode temp=head;
        //running loop upto which my node are equal to or greater than k value
        while(size>=k){
            ListNode ch=null;
            ListNode ct=null;
            
            int val=k;
            for(int i=1;i<=val;i++){
          
                
                ListNode tn=temp.next;
                temp.next=null;   // 1-> 2   1 2
                
                if(ch==null){
                    ch=ct=temp;  //ch=ct=1 
                }else{
                    temp.next=ch;   //2 ka next 1  2->1
                    ch=temp;
                }
                
                temp=tn;
                size--;
                
            }
            
            if(oh==null){
                oh=ch;   // at 1
                ot=ct;   // at 1 
            }else{
                ot.next=ch;  //2->1->4->3
                ot=ct;
            }
            
        }
        
        if(size>0){
            ot.next=temp;// 2->1->4->3   //add 5 at last;
        }
        return oh;
    
    }
    
    
    public static int size(ListNode head){
        ListNode temp=head;
        int size=0;
        
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        return size;
        
    } 

}