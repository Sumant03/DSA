class Solution {
    public int findDuplicate(int[] nums) {
        int ans=-1;
        
        for(int i=0;i<nums.length;i++){
            
            
            int idx=Math.abs(nums[i]);
            int val=nums[idx];
            
            if(val<0){
                ans=idx;
            }
            else{
                nums[idx]=-1*Math.abs(val);
            }
        }
      return ans;
    }
}