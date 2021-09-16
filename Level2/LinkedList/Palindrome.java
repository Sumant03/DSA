package Level2.LinkedList;


import java.util.*;

class Palindrome {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

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
    
    
       public static  ListNode middleNode(ListNode head) {
         if(head==null){
             return head;
         }
           
           
            ListNode fast=head;
            ListNode slow=head;
            
            while(fast.next!=null&&fast.next.next!=null){
                
                fast=fast.next.next;
                slow=slow.next;
                
            }
            return slow;
        
    }
    
    
    public static boolean isPalindrome(ListNode head) {
        
        ListNode mid=middleNode(head);
        ListNode nh=mid.next;
        
        
        mid.next=null;
        
        ListNode rh=reverseList(nh);
        ListNode lh=head;
        
        while(rh!=null){
            
            if(lh.val!=rh.val){
                return false;
            }
            lh=lh.next;
            rh=rh.next;
        }
        return true;
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

        System.out.println(isPalindrome(dummy.next));
    }
}