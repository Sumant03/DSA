class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()){
            return new ArrayList<>();
        }
        
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        
        for(int i=0;i<p.length();i++){
            
            char ch=p.charAt(i);
           int val= map.getOrDefault(ch,0)+1;
            map.put(ch,val);
        }
        
        int i=0;
        int j=0;
        for(i=0;i<p.length();i++){
          char ch=s.charAt(i);
          int val= map2.getOrDefault(ch,0)+1;
          map2.put(ch,val);
        }
                
        for(;i<s.length();i++,j++){
            if(areMapsEquals(map2,map)==true){ //runs constant time 
                ans.add(j);
            }
            //acquire
            char chi=s.charAt(i);
            int nfi=map2.getOrDefault(chi,0)+1;
            map2.put(chi,nfi);
            
            //
            char chj=s.charAt(j);
            if(map2.get(chj)==1){
                map2.remove(chj);
            }else{
            int val=map2.getOrDefault(chj,0)-1;
            map2.put(chj,val);
            }
            
        }
        
        if(areMapsEquals(map2,map)){ //runs constant time 
                ans.add(j);
            }
        
    return ans;

    }
    public static boolean areMapsEquals(HashMap<Character,Integer> map2,HashMap<Character,Integer> map){
        if(map2.size()!=map.size()){
            return false;
        }
        
        for(char ch:map2.keySet()){
            int f1=map2.get(ch);
            int f2=map.getOrDefault(ch,0);
            
            if(f1!=f2){
                return false;
            }
        }
        return true;
        
        
    }
}