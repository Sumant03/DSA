
import java.io.*;
import java.util.*;

public class MergeKSorted {
   public static class Pair implements Comparable<Pair>{
      int li,vi,val;
      Pair(int li,int vi,int val){
          this.li = li;
          this.vi = vi;
          this.val = val;
      }
      
      public int compareTo(Pair o){
          return this.val - o.val;
      }
  }

   
   
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
    

      // write your code here
   PriorityQueue<Pair> pq=new PriorityQueue<>();
   
   ArrayList<Integer> res=new ArrayList<>();
   for(int i=0;i<lists.size();i++){
   pq.add(new Pair(i,0,lists.get(i).get(0)));
   }
   
   
   while(pq.size()>0){
    Pair p=pq.remove();
    res.add(p.val);
    
    if(p.vi+1<lists.get(p.li).size()){
        pq.add(new Pair(p.li,p.vi+1,lists.get(p.li).get(p.vi+1)));
        
    }
    
    
       
   }


      return res;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}