import java.util.*;
public class LongestSubUniqueCharacter {
    public int lengthOfLongestSubstring(String A) {
  	  HashMap<Character,Integer> map=new HashMap<>();
    int olen=0;

    int i=-1;
    int j=-1;



    while(i<A.length()-1){
        while(i<A.length()-1){
          

            i++;

            char ch=A.charAt(i);
            int of=map.getOrDefault(ch,0);
            map.put(ch,of+1);

            if(map.get(ch)>1){
                break;
            }else{
                  int len=i-j;
            olen=Math.max(len,olen);
            }
        }
        while(j<i){
         j++;
         char ch=A.charAt(j);
         if(map.get(ch)==1){
             map.remove(ch);
         }else{
             int val=map.get(ch);
             map.put(ch,val-1);
             break;             
         }           

           
        }
    }
    return olen;
    }
}

