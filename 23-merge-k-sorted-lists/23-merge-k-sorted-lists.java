/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }  
 * }
 */
class Solution {
    public class Pair implements Comparable<Pair>{
        ListNode node;
        
        Pair(){
            
        }
        
        Pair(ListNode node){
            this.node=node;
        }
        
        public int compareTo(Pair o){
            return this.node.val-o.node.val;
        }
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0){
            return null;
        }      
        ListNode dh=new ListNode(-1);
        ListNode dt=dh;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        
        for(ListNode node:lists){
            if(node!=null){
            pq.add(new Pair(node));
            }
        }
        
        while(pq.size()>0){
            Pair p=pq.remove();
            ListNode cn=p.node;
            dt.next=cn;
            dt=dt.next;
            
               if(cn!=null&&cn.next!=null){
                   pq.add(new Pair(cn.next));
               }
            
        }
        
        return dh.next;
        
        
    }
}