class Solution {
    public int maxSubArray(int[] arr) {
        int csum=arr[0];
        int msum=arr[0];
        
        for(int idx=1;idx<arr.length;idx++){
            
            
            if(csum<0){
                csum=0;
            }
            csum+=arr[idx];
            msum=Math.max(csum,msum);
            
        }
        
        
        return msum;
    }
}