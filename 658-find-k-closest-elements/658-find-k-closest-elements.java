class Solution {
    public static class Pair implements Comparable<Pair> {
        int val;
        int gap;
        
        Pair(){
            
        }
        Pair(int val,int gap){
            this.val=val;
            this.gap=gap;
        }
        
        public int compareTo(Pair o){
            if(this.gap!=o.gap){
                return this.gap-o.gap;
            }else{
                return this.val-o.val;
            }
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(int i=0;i<arr.length;i++){
            if(pq.size()<k){
                pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            }else if(pq.peek().gap>Math.abs(arr[i]-x)){
                pq.remove();
                pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            }
        }
        
        List<Integer> list=new ArrayList<>();
        
       while(pq.size()>0){
           int val=pq.remove().val;
           list.add(val);
       }
        
        Collections.sort(list);
        
        return list;
    }
}