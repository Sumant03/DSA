package Level2.LinkedList;
import java.util.*;

class subtraction {
  public static Scanner scn = new Scanner(System.in);

  public static class ListNode {
    int val = 0;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }
  
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        
        while(curr!=null){
            ListNode n=curr.next;
            
            curr.next=prev;
            prev=curr;
            
            curr=n;
        }
        return prev;
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
  //1-> l1 greater;
  //-1-> L2 greater
  // 0 -> exactly same
  
  public static int greater(ListNode l1,ListNode l2){
 int c1=size(l1);
 int c2=size(l2);
 
 if(c1>c2){
     return 1;
 }else if(c2>c1){
     return -1;
 }else{
     ListNode p1=l1;
     ListNode p2=l2;
     while(p1!=null){
         if(p1.val>p2.val){
             return 1;
         }else if(p1.val<p2.val){
             return -1;
         }else{
             p1=p1.next;
             p2=p2.next;
         }
         
     }
 }
 
 return 0;
      
  }

  public static ListNode subtractTwoNumbers(ListNode l1, ListNode l2) {

ListNode t1=null;
ListNode t2=null;
int c=greater(l1,l2);
if(c==0){
    return new ListNode(0);
} else if(c==1){
    t1=reverse(l1);
    t2=reverse(l2);
}else{
    t1=reverse(l2);
    t2=reverse(l1);
}


int br=0;
   ListNode dh=new ListNode(-1);
    ListNode dt=dh;
    
while(t1!=null){
    int diff=t1.val+br;
    
    if(t2!=null){
        diff=-t2.val;
    }
    
    if(diff<0){
        diff+=10;
        br=-1;
    }else{
        br=0;
    }
    
    ListNode nn=new ListNode(diff);
    
    dt.next=nn;
    dt=dt.next;
    t1=t1.next;
}

ListNode ans=reverse(dh.next);


while(ans!=null&&ans.val==0){
    ans=ans.next;
}

return ans;
  }

  // InFput_code===================================================

  public static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.val + " ");
      node = node.next;
    }
  }

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
    ListNode head2 = makeList(scn.nextInt());

    ListNode ans = subtractTwoNumbers(head1, head2);
    printList(ans);
  }

}