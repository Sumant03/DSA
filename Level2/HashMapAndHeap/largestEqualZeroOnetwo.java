
import java.util.*;

public class largestEqualZeroOnetwo{

    public static int solution(int[] arr) {
        // write your code here
    HashMap<String,Integer> map=new HashMap<>();//(c1-c0)-(c2-c1) vs first occ;
    
    map.put("0 0",-1);
    int ln=0;
    int c0=0;
    int c1=0;
    int c2=0;
    
    for(int i=0;i<arr.length;i++){
      
      if(arr[i]==0){
          c0++;
      }else if(arr[i]==1){
          c1++;
      }else{
          c2++;
      }
      String key=(c1-c0)+" "+(c2-c1);
      
       
     if(map.containsKey(key)==false){
         map.put(key,i);
     }else{
         int len=i-map.get(key);
         if(ln<len){
             ln=len;
         }
     }
    }
    
    return ln;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
