package Level2.LinkedList;


import java.util.*;

class  unfold {
    
      public static ListNode reverseList(ListNode head) {
        
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
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void unfold(ListNode head) {
    
    ListNode ldummy=new ListNode(-1);
    ListNode rdummy=new ListNode(-1);
    
    ListNode lt=ldummy;
    ListNode rt=rdummy;
    
    ListNode temp=head;
    boolean flag=true;
    
    while(temp!=null){
        
        if(flag==true){
            
            lt.next=temp;
            lt=lt.next;
            
            flag=false;
        }else{
            rt.next=temp;
            rt=rt.next;
            flag=true;
        }
        temp=temp.next;
    }
    rt.next=null;
    
    ListNode rh=reverseList(rdummy.next);
    lt.next=rh;
    
    
    
    
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}