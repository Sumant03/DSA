
import java.util.*;

public class LargestDivisibleByK  {

    public static int solution(int[] arr, int k) {
        // write your code here
 HashMap<Integer,Integer> map=new HashMap<>(); //prefix sum vs it's first occ
		
		int ps=0;
		int ln=0;
	     map.put(0,-1);
	 
		for(int i=0;i<arr.length;i++){
		    ps+=arr[i];
		    
		    int rem=ps%k;
		    
		    if(rem<0){
		        rem+=k;
		    }
		 
		    if(map.containsKey(rem)==true){
		        int len=i-map.get(rem);
		        if(ln<len){
		            ln=len;
		        }
		         
		        
		    }
		    
		    if(map.containsKey(rem)==false){
		        map.put(rem,i);
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
        int k = scn.nextInt();
        System.out.println(solution(arr, k));
    }

}

