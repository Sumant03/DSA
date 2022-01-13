class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
 
            HashMap<Integer,Integer> map=new HashMap();
            
            
           for(int i=0;i<nums.length;i++){
              
               int val=target-nums[i];
               
               if(map.containsKey(val)){
                   arr[0]=map.get(val);
                   arr[1]=i;
                   break;
               } 
               
               map.put(nums[i],i);
           }

        return arr;
    }
}