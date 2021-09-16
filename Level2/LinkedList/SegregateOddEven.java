package Level2.LinkedList;



import java.util.*;

class  SegregateOddEven{
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregateEvenOdd(ListNode head) {
        
        if(head==null){
            return null;
        }
     ListNode oddt=new ListNode(-1);
     ListNode event=new ListNode(-1);
     
     ListNode oddn=oddt;
     ListNode evenn=event;
     
     
     ListNode temp=head;
     
     while(temp!=null){
         
         
         if(temp.val%2==0){
             evenn.next=temp;
             evenn=evenn.next;
             
         }else{
             oddn.next=temp;
             oddn=oddn.next;
         }
         temp=temp.next;
     }
     
     oddn.next=null;
     evenn.next=oddt.next;
     
     return event.next;
     
     
     
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

        ListNode head = segregateEvenOdd(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}