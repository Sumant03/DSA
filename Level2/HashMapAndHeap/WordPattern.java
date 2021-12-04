
import java.util.*;

public class WordPattern  {

	public static boolean wordPattern(String pattern, String str) {
		// write your code here
   HashSet<String> used=new HashSet<>();
   HashMap<Character,String> map=new HashMap<>();
   
   String[] arr=str.split(" ");
   
   for(int i=0;i<pattern.length();i++){
      char ch=pattern.charAt(i);
      String word=arr[i];
      
      if(map.containsKey(ch)==false){
          if(used.contains(word)==true){
              return false;
          }
          
          used.add(word);
          map.put(ch,word);
          
      }else{
          String pmword=map.get(ch);
          if(pmword.equals(word)==false){
              return false;
          }
          
      }
      
   }
   return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String pattern = scn.nextLine();
		String words = scn.nextLine();
		System.out.println(wordPattern(pattern,words));
	}

}
