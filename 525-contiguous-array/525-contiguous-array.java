class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            if(map.containsKey(sum)){
                
                int val=i-map.get(sum);
                if(val>max){
                    max=val;
                }
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}