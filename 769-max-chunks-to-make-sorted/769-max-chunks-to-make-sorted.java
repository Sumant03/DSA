class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunk=0;
        int maxR=0;
        
        for(int i=0;i<arr.length;i++){
            maxR=Math.max(maxR,arr[i]);
            
            if(maxR==i){
                chunk++;
            }
        }
        return chunk;
        
    }
}