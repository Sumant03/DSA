class Solution {
    public int pivotIndex(int[] arr) {
        
        int rsum=0;
        int lsum=0;
        
        for(int i=0;i<arr.length;i++){
            rsum+=arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            rsum-=arr[i]; 
           
            if(lsum==rsum){
                return i;
            }
            lsum+=arr[i];
                
        }
        return -1;
    }
}