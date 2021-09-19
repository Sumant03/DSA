package Level2.LinkedList;
import java.util.*;

class CycleNodeInLL {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode CycleNode(ListNode head) {
      if(head==null){
          return null;
      }
      
        ListNode det=head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode meet=null;
        // ListNdoe cycleNode=null;
        
        while(fast!=null&&fast.next!=null){
              fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
             slow=head;
             
             while(slow!=fast){
                 slow=slow.next;
                 fast=fast.next;
             }
            return slow;
            }
        }
        
        return null;
    }

    public static ListNode takeInput() {
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }
        int idx = scn.nextInt();
        if (idx >= 0) {
            ListNode curr = dummy.next;
            while (idx-- > 0) {
                curr = curr.next;
            }
            prev.next = curr;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = takeInput();
        ListNode ans = CycleNode(head);
        System.out.println(ans!=null?ans.val:-1);
    }
}