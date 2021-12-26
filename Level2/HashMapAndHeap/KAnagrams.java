import java.util.*;

public class  KAnagrams{
	public static boolean areKAnagrams(String str1, String str2, int k) {
		// write your code here

    HashMap<Character,Integer> map=new HashMap<>();
 
    
    for(int i=0;i<str1.length();i++){
        char ch=str1.charAt(i);
        
        int val=map.getOrDefault(ch,0)+1;
        map.put(ch,val);
    }
    
    for(char ch:str2.toCharArray()){
        
        int val=map.getOrDefault(ch,0)-1;
        map.put(ch,val);
        
    }
    
    int count =0;
    
    for(char ch: map.keySet()){
        int  val=map.get(ch);
        
        if(val>0){
            count+=val;
        }
    }
     
    return count<=k;
    
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int k = s.nextInt();
		System.out.println(areKAnagrams(str1, str2, k));

	}

}
