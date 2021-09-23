package Level2.LinkedList;


import java.util.*;

class SegregateAtPivot{
  public static Scanner scn = new Scanner(System.in);

  public static class ListNode {
    int val = 0;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }
  public static ListNode getNodeAt(ListNode head,int pivotIdx){
      
      ListNode temp=head;
      while(pivotIdx-->0&&temp!=null){
          temp=temp.next;
          
      }
      return temp;
  }

  public static ListNode segregate(ListNode head, int pivotIdx) {
    
        ListNode pn=getNodeAt(head,pivotIdx);
        int pivot=pn.val;
    
        ListNode sh=new ListNode(-1);
        ListNode st=sh;
        
        
        ListNode gh=new ListNode(-1);
        ListNode gt=gh;
        
        ListNode temp=head;
        
        while(temp!=null){
            if(temp==pn){
            //   continue;
            }
            else if(temp.val<=pivot){
                st.next=temp;
                st=st.next;
            }else if(temp.val>pivot){
                gt.next=temp;
                gt=gt.next;
            }
            temp=temp.next;
        }
        
        gt.next=null;
      st.next=pn;
      pn.next=gh.next;
      return sh.next;
        
        
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
    int idx = scn.nextInt();
    h1 = segregate(h1, idx);
    printList(h1);
  }
}