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
    public static class Pair implements Comparable<Pair> {
        ListNode node;
        
          Pair() {

        }
        
        Pair(ListNode node){
            this.node=node;
        }
        public int compareTo(Pair o){
            return this.node.val-o.node.val;
        }
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode dh=new ListNode(-1);
        ListNode dt=dh;
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        
        for(ListNode node:lists){
            
            if(node==null){
                continue;
            }
            
            Pair p=new Pair(node);
                pq.add(p);
        }
        
        while(pq.size()>0){
            
            Pair pr=pq.remove();
            ListNode node=pr.node;
            
            dt.next=node;
            dt=dt.next;
            
            
            
            if(node.next!=null){
                Pair p=new Pair(node.next);
                pq.add(p);
            }
            
            
        }
        
        return dh.next;
        
        
        
    }
}