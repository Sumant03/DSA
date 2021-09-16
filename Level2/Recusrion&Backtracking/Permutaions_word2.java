
import java.io.*;
import java.util.*;

public class Permutaions_word2 {

  public static void generateWords(int cc, String str, Character[] spots, 
                                   HashMap<Character, Integer> lastOccurence) {
    // write your code here
    if(cc==str.length()){
        for(int idx=0;idx<spots.length;idx++){
            System.out.print(spots[idx]);
        }
        System.out.println();
        return;
    }


    
    char ch =str.charAt(cc);
    int lo=lastOccurence.get(ch);
    
    for(int idx=lo+1;idx<spots.length;idx++){
        if(spots[idx]==null){
        spots[idx]=ch;
        lastOccurence.put(ch,idx);
        generateWords(cc+1,str,spots,lastOccurence);
        lastOccurence.put(ch,lo);
        spots[idx]=null;
             
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Character[] spots = new Character[str.length()];
    HashMap<Character, Integer> lastOccurence = new HashMap<>();
    for(char ch: str.toCharArray()){
      lastOccurence.put(ch, -1);
    }

    generateWords(0, str, spots, lastOccurence);
  }

}