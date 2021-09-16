package Level2.LinkedList;



import java.util.*;

class MergeTwoSortedLL {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode head=new ListNode(-1);
         ListNode temp=head;
         while(l1!=null&&l2!=null){
             
             
             if(l1.val<l2.val){
                 head.next=l1;
                 l1=l1.next;
             }else{
                 head.next=l2;
                 l2=l2.next;
             }
             head=head.next;
         }
         
         
         while(l2!=null){
             head.next=l2;
             l2=l2.next;
             head=head.next;
         }
         
         while(l1!=null){
             head.next=l1;
             l1=l1.next;
             head=head.next;
         }
         return temp.next;
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
        int m = scn.nextInt();
        ListNode h2 = createList(m);


        ListNode head = mergeTwoLists(h1, h2);
        printList(head);
    }
}