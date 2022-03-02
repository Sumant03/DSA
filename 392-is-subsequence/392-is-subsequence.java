class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s==""||t==""){
            return true;
        }
        
        int i=0;
        int j=0;
        
        while(j<t.length()){
            
            if(i<s.length()&&s.charAt(i)==(t.charAt(j))){
                i++;
            }

            j++;
        }
        
        return i==s.length();
    }
}