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
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    
    public ListNode mergeSort(ListNode node){
        if(node==null||node.next==null){
            return node;
        }
        
        ListNode mid=midNode(node);
        ListNode midn=mid.next;
        mid.next=null;
        
        
        ListNode left=mergeSort(node);
        ListNode right=mergeSort(midn);
        
        return mergerLinkedList(left,right);
        
    }
    
    public ListNode mergerLinkedList(ListNode ln,ListNode rn){
        ListNode hn=new ListNode(-1);
        ListNode ht=hn;
        
        while(ln!=null&&rn!=null){
            
            if(ln.val<=rn.val){
                ht.next=ln;
                ht=ht.next;
                ln=ln.next;
            }else{
                 ht.next=rn;
                ht=ht.next;
                rn=rn.next;
            }
        }
        
        while(ln!=null){
            ht.next=ln;
            ht=ht.next;
            ln=ln.next;
        }
        
           while(rn!=null){
            ht.next=rn;
            ht=ht.next;
            rn=rn.next;
        }
        
        
        return hn.next;
    }
    
    public ListNode midNode(ListNode node){
        if(node==null){
            return node;
        }
        
        ListNode sl=node;
        ListNode ft=node;
        
        while(ft.next!=null&&ft.next.next!=null){
            sl=sl.next;
            ft=ft.next.next;
        }
        
        return sl;
    }
    
}