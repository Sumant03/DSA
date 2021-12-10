
import java.util.*;

public class CountOfUniqueSubstring  {

	public static int solution(String A) {
		// write your code here
 HashMap<Character,Integer> map=new HashMap<>();
    int olen=0;
    int count=0;
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
                count+=(i-j);
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
             count+=i-j;
             break;             
         }           

           
        }
    }
    return count;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
