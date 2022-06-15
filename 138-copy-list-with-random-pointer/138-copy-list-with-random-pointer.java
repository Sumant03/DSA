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
        
        HashMap<Node,Node> map=new HashMap<>();
        
        Node dummy=new Node(-1);
        Node list=dummy;
        
        Node curr=head;
        
        while(curr!=null){
            
            list.next=new Node(curr.val);
            
            list=list.next;
            map.put(curr,list);
            
            curr=curr.next;
            
            
        }
        dummy=dummy.next;
        curr=head;
        
        Node temp=dummy;
        while(curr!=null){
            temp.random=map.get(curr.random);
            curr=curr.next;
            temp=temp.next;
        }
        
        return dummy;
        
    }
}