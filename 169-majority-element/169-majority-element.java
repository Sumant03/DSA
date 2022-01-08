class Solution {
    public int majorityElement(int[] nums) {
        int val=nums[0];
        int count=1;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==val){
                count++;
            }else{
                count--;
            }
            
            
            if(count==0){
                val=nums[i];
                count=1;
            }
            
        }
        
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                ans++;
            }
        }
        
        if(ans>nums.length/2){
            return val;
        }else{
            return -1;
        }
        
        
    }
}