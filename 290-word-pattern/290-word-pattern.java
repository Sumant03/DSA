class Solution {
    public boolean wordPattern(String pattern, String s) {
           
        
        
        HashMap<String,Character> map=new HashMap<>();
        
        String[] str = null;  

        str = s.split(" "); 
        if(str.length>pattern.length()||str.length<pattern.length()){
            return false;
        }
        boolean[] isPresent=new boolean[26]; 
        
        for(int i=0;i<str.length;i++){
          
            char ch=pattern.charAt(i);
            int val=ch-'0';
            if(!map.containsKey(str[i])&&isPresent[val-49]==false){
                isPresent[val-49]=true;
                map.put(str[i],ch);
            }
        }
        String b="";
        for(int i=0;i<str.length;i++){
            char c=map.getOrDefault(str[i],' ');
            b=b+c;
        }
        
        if(b.equals(pattern)==true){
            return true;
        }else{
            return false;
        }
        
    }
}