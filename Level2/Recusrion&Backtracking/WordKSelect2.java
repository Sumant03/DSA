

import java.io.*;
import java.util.*;

public class WordKSelect2 {

  public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    int k = scn.nextInt();

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }

    combination(ustr, 0, k,"",-1);
  }
  
  
  
  
  public static void combination (String ustr,int ssf,int ts,String asf,int ls){
          
          if(ssf==ts){
      
          
              System.out.println(asf);
              return;
          }
          
  
      
      
      for(int idx=ls+1;idx<ustr.length();idx++){
           char ch=ustr.charAt(idx);
          combination(ustr,ssf+1,ts,asf+ch,idx);
      }
      
            
  }

}
