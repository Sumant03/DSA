class Solution {
    public int maxSubArray(int[] arr) {
        int csum=0;
        int msum=arr[0];
        
        for(int idx=0;idx<arr.length;idx++){
            
            csum+=arr[idx];
           
            msum=Math.max(csum,msum);
             if(csum<0){
                csum=0;
            }
             
        }
        
        
        return msum;
    }
}