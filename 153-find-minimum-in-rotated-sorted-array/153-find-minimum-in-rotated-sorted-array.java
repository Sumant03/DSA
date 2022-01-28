class Solution {
    public int findMin(int[] nums) {
         int lo=0;
        int hi=nums.length-1;
        
        if(nums.length==1){
            return nums[0];
        }
        
        if(nums[lo]<=nums[hi]){
            return nums[0];
        }
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            
            //is mid's part 2 first element
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            
            //is mid part 1 last element 
            else if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            //discard sorted half
            
                if(nums[lo]<=nums[mid]){
                    lo=mid+1;
                    
                }else{
                    hi=mid-1;
                }
            
        }
        return -1;
    }
}