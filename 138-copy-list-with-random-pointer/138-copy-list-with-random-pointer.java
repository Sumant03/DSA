/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
     
      Node curr=head;
        
      while(curr!=null){
          
          Node nnNode=new Node(curr.val);
          Node currN=curr.next;
          
          curr.next=nnNode;
          nnNode.next=currN;
          
          curr=currN;
      }
        
        curr=head;
        
        while(curr!=null){
            
            Node forw=curr.next;
            
            Node random=curr.random;
            if(random!=null){
                forw.random=random.next;
            }
            curr=curr.next.next;
        }
        
        Node dummy=new Node(-1);
        Node ans=dummy;
        
        curr=head;
        
        while(curr!=null){
            
            ans.next=curr.next;
            curr.next=curr.next.next;
            
            ans=ans.next;
            curr=curr.next;
        }
        
        return dummy.next;
    }
}