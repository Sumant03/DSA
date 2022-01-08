class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int val1=nums[0];
        int c1=1;
        
        int val2=0;
        int c2=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==val1){
                c1++;
            }else if(nums[i]==val2){
                c2++;
            }else{
               if(c1==0){
                   val1=nums[i];
                   c1=1;
               }else if(c2==0){
                   val2=nums[i];
                   c2=1;
               }else{
                c1--;
                c2--;
               }
            }
            
            
            
        }
        
        int f1=0;
        int f2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val1){
                f1++;
            }
             else if(nums[i]==val2){
                f2++;
            }
        }
        
        
        if(f1>nums.length/3){
            ans.add(val1);
        }
        if(f2>nums.length/3){
            ans.add(val2);
        }
        
        
        return ans;
  
    }
}