import java.util.*;

public class SmallestSubstring1 {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        
        for(int i=0;i<t.length();i++){
         char ch=t.charAt(i);
            
            
            int val=map1.getOrDefault(ch,0);
                map1.put(ch,val+1);
        }
         
        int mc=0;
        HashMap<Character,Integer> map2=new HashMap<>();
        int si=0;
        int ei=-1;
        int olen=Integer.MAX_VALUE;
        int i=-1;
        int j=-1;
        
        
        
        while(i<s.length()-1){
            
            while(i<s.length()-1&&mc<t.length()){
                i++;
            
                //acquire ith char
                char ch=s.charAt(i);
                int val=map2.getOrDefault(ch,0);
                map2.put(ch,val+1);
                
                //check if it is match count;
                
                if(map2.getOrDefault(ch,0)<=map1.getOrDefault(ch,0)){
                    mc++;
                }
                
            }
                   
            while(j<i&&mc==t.length()){
                int len=i-j;
                
                
                if(len<olen){
                    olen=len;
                    si=j+1;
                    ei=i;
                }
                
                j++;
                char ch=s.charAt(j);
                
                if(map2.get(ch)==1){
                    map2.remove(ch);
                    
                }else{
                    int of=map2.get(ch);
                    map2.put(ch,of-1);
                }
                
                if(map2.getOrDefault(ch,0)<map1.getOrDefault(ch,0)){
                    mc--;
                }
                    
            }
                       
    }
            return s.substring(si,ei+1);
    }
}