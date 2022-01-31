class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int idx=0;
        
        for(int i=0;i<nums.length;i++){
        
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>max/2&&nums[i]!=max){
                return -1;
            }
        }
        return idx;
    }
}