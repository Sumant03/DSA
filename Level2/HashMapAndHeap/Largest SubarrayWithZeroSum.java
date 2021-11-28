// package Level2.HashMapAndHeap;
// import java.util.*;

// public class SubarrayWithZeroSum {
	
// 	public static int solution(int[] arr) {
// 		// write your code here
// 		HashMap<Integer,Integer> map=new HashMap<>(); //prefix sum vs it's first occ
		
// 		int ps=0;
// 		int ln=0;
		
// 		map.put(0,-1);
		
// 		for(int i=0;i<arr.length;i++){
// 		    ps+=arr[i];
		    
// 		    if(map.containsKey(ps)==false){
// 		        map.put(ps,i);
// 		    }else{
// 		        int len=i-map.get(ps);
// 		        if(ln<len){
// 		            ln=len;
// 		        }
		        
		       
// 		    }
// 		}
		

// 		return ln;
// 	}

// 	public static void main(String[] args) {
// 		Scanner scn = new Scanner(System.in);
// 		int[] arr = new int[scn.nextInt()];
// 		for (int i = 0; i < arr.length; i++) {
// 			arr[i] = scn.nextInt();
// 		}
// 		System.out.println(solution(arr));
// 	}

// }
