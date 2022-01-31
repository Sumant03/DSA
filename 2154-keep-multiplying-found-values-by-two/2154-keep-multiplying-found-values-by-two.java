class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            
            set.add(val);
        }
        
        while(true){
            
            if(set.contains(original)){
                original=original*2;
            }
            else{
                break;
            }
            
        }
    
        
        return original;
    }
}