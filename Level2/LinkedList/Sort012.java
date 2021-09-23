package Level2.LinkedList;

import java.util.*;

class Sort012 {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
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

    public static ListNode segregate012(ListNode head) {
    
       ListNode zeroh=new ListNode(-1);
        ListNode zerot=zeroh;
        
        
        ListNode oneh=new ListNode(-1);
        ListNode onet=oneh;
        
        ListNode twoh=new ListNode(-1);
        ListNode twot=twoh;
        
        
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==0){
                zerot.next=temp;
                zerot=zerot.next;
            }else if(temp.val==1){
                onet.next=temp;
                onet=onet.next;
            }else if(temp.val==2){
                twot.next=temp;
                twot=twot.next;
            }
            temp=temp.next;
        }
           onet.next=twoh.next;
           zerot.next=oneh.next;
           twot.next=null;
           
           return zeroh.next;
      
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
        h1 = segregate012(h1);
        printList(h1);
    }
}