class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<nums.length;i++){
        sb.setLength(0);
        int prev=i;
        while(i<nums.length-1 && nums[i]+1==nums[i+1]){
            i++;
        }
        if(i==prev){
             sb.append(nums[prev]);
        }
        else{
            sb.append(nums[prev]);
            sb.append("->");
            sb.append(nums[i]);
        }
        
        res.add(sb.toString());
        
    }
    return res;
    }
}