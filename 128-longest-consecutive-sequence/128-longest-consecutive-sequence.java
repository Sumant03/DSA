class Solution {
    public int longestConsecutive(int[] nums) {
     
        HashSet<Integer> set =new HashSet<>();
        int longestStreak=0;
        
        for(int num:nums){
            set.add(num);
        }
        
        for(int num:nums){
            
            if(!set.contains(num-1)){
                int currentStreak=1;
                int cnum=num;
                
                while(set.contains(cnum+1)){
                    currentStreak+=1;
                    cnum+=1;
                }
                
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        
        return longestStreak;
        
    }
}