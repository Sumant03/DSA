
import java.io.*;
import java.util.*;

public class CoinPermutations1 {

    public static void coinChange(int[] coins, int amtsf, int tamt, String asf, boolean[] used){
       // write your code here
       if(amtsf==tamt){
           System.out.println(asf+".");
       }
       
       for(int idx=0;idx<coins.length;idx++){
         if(used[idx]==false){
             used[idx]=true;
             coinChange(coins,amtsf+coins[idx],tamt,asf+coins[idx]+"-",used);
             used[idx]=false;
             
         }   
       }
       
       
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int amt = Integer.parseInt(br.readLine());
        boolean[] used = new boolean[coins.length];
        coinChange(coins, 0, amt, "", used);
    }
}