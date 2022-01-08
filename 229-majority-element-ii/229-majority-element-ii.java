class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            
            int val=nums[i];
            
            int freq=map.getOrDefault(val,0)+1;
            map.put(val,freq);
        }
        
        for(int val:map.keySet()){
            
            if(map.get(val)>nums.length/3){
                list.add(val);
            }
        }
        
        return list;
    }
}