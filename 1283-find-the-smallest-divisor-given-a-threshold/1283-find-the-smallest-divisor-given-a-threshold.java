class Solution {
    public int smallestDivisor(int[] nums, int h) {
        
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        
        if(h==nums.length){
            return max;
        }
        
        int lo=1,hi=max;
        int ans=0;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(isPossible(nums,mid,h)==true){
                //mid jitni speed rkhte huye kya me 
                //piles ke saare banana ko h hours mein khaaa skte hu 
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        
        }
    return ans;
        
    }

    
    public static boolean isPossible(int[] nums,int mid,int th){
        int t=0;
        
        for(int val:nums){
            
            t+=Math.ceil(1.0*val/mid);
            
            
        }
    return t<=th;
    }
}