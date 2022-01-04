class Solution {
    public int[] sortedSquares(int[] nums) {
       int[]  ans=new int[nums.length];
        
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        
        while(j>=i){
            
            if(Math.abs(nums[j]) > Math.abs(nums[i])){
                ans[k]=nums[j]*nums[j];
                j--;
            }else{
                ans[k]=nums[i]*nums[i];
                i++;
            }
            k--;
           
            
        }
        
        return ans;
    }
}