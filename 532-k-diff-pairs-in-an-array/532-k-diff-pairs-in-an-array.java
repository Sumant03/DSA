class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            
             int val=map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],val);
        }
        
        for(int val:map.keySet()){
            
           
                
            
            if(map.containsKey(val+k)){
                 
                 if (k == 0 && map.get(val)> 1) {
                    count++;
                    System.out.println("1 "+val);
                }else if(k!=0){
                     count++;
                        System.out.println("2 "+val);
                 }
            }
        }
        return count;
    }
}