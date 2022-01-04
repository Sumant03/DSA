class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length];
        
        
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i]*left[i-1];
        }
        
         right[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            right[j]=right[j+1]*nums[j];
        }
        
        for(int i=0;i<nums.length;i++){
            int pes= (i==0?1:left[i-1])*(i==nums.length-1?1:right[i+1]);
            ans[i]=pes;
        }
        
        return ans;
    }
}