class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        
       
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            map.put(val,i);
        }
         Arrays.sort(nums);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[nums.length-1]<nums[i]*2){
                return -1;
            }
        }
        
        return map.get(nums[nums.length-1]);
    }
}