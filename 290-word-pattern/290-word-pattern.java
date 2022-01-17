class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map=new HashMap<>();
        
        String[] str =s.split(" ");
        
        if(str.length!=pattern.length()){
                return false;
            }
        
        for(int i=0;i<str.length;i++){
            
            String gv=map.get(pattern.charAt(i));
            
            if(gv!=null){
                if(!gv.equals(str[i])){
                    return false;
                }
            }else if(!map.containsValue(str[i])){
                map.put(pattern.charAt(i),str[i]);
            }else{
                return false;
            }
            
           }
                return true;
    }
}