package Level2.LinkedList;


import java.util.*;

class IntersectionUsingCycle{
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode gettail(ListNode head){
        ListNode temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }

    public static ListNode IntersectionNodeInTwoLL(ListNode headA, ListNode headB) {
        ListNode tail=gettail(headA);
        
        tail.next=headB;
        ListNode slow=headA;
        ListNode fast=headA;
        
        while(fast!=null&&fast.next!=null){
              fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
             slow=headA;
             
             while(slow!=fast){
                 slow=slow.next;
                 fast=fast.next;
             }
             tail.next=null;
            return slow;
            }
        }
        tail.next=null;    
        return null;
    }
  
        
    



    // Input_code===================================================

    public static ListNode makeList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head1 = makeList(scn.nextInt());

        int idx = scn.nextInt();

        ListNode head2 = makeList(scn.nextInt());

        if (idx >= 0) {
            ListNode curr = head1;
            while (idx-- > 0)
                curr = curr.next;

            ListNode prev = head2;
            while (prev.next != null)
                prev = prev.next;

            prev.next = curr;
        }

        ListNode ans = IntersectionNodeInTwoLL(head1, head2);
        System.out.println(ans != null ? ans.val : -1);
    }
}