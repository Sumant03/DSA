

import java.io.*;
import java.util.*;

public class AllPalindromicPermutation {

	public static void generatepw(int cs, int ts, HashMap<Character, Integer> fmap, Character oddc, String asf) {
		if(cs==ts){
          String val="";
          String ans="";
         StringBuilder sb=new StringBuilder(asf);
         sb=sb.reverse();
         val=sb.toString();
          if(oddc!=null){
           ans= asf+oddc+val;
          }else{
              ans=asf+val;
          }
          System.out.println(ans);
          return;
          
		}
		
		  for(char ch :fmap.keySet()){
		      int freq=fmap.get(ch);
		      
		      if(freq>0){
		          fmap.put(ch,freq-1);
		          generatepw(cs+1,ts,fmap,oddc,asf+ch);
		          fmap.put(ch,freq);
		      }
		  }
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		HashMap<Character, Integer> fmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
		}
		
		Character oddc=null;
		int count=0;
		int len=0;
		for(char ch:fmap.keySet()){
		    int freq=fmap.get(ch);
		    
		    if(freq%2==1){
		        oddc=ch;
		        count++;
		    }
		    len+=(freq/2);
		    fmap.put(ch,freq/2);
		}
		
		if(count>1){
		    System.out.println("-1");
		}else{
		    generatepw(0,len,fmap,oddc,"");
		}
		
		//write your code here
	}
	
}
