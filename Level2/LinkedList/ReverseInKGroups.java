package Level2.LinkedList;



import java.util.*;

class ReverseInKGroups {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

     public static int count(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        
        return count;
        
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
     
        int count=count(head);
         
        if(k>count||k==0){
            return head;
        }
        
        ListNode ah=null;
        ListNode at=null;
        ListNode temp=head;
        
        while(count>=k){
            ListNode ct=null;
            ListNode ch=null;
            
            for(int i=1;i<=k;i++){
                
                ListNode n=temp.next;
                
                temp.next=null;
                
                if(ch==null){
                    ch=ct=temp;
                }else{
                    
                    temp.next=ch;
                    ch=temp;
                }
                
                temp=n;
                count--;
                
            }
            
            if(ah==null){
                ah=ch;
                at=ct;
            }else{
                at.next=ch;
                at=ct;
            }
            
        }
        
        if(count>0){
            at.next=temp;
        }
        
        return ah;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);

        int k = scn.nextInt();
        h1 = reverseKGroup(h1, k);
        printList(h1);
    }
}
