class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")||s.length()==1){
            return 1;
        } 
        
        int max=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        
        for(int right=0;right<s.length();right++){
            
            char ch=s.charAt(right);
            if(set.contains(ch)){
                System.out.println(right +' '+left);
                while(left<right&&set.contains(ch)){
                    set.remove(s.charAt(left));
                    left++;
                }
                    
            }
             set.add(ch);
             max=Math.max(max,right-left+1);
        }
        
        return max;
    }
}