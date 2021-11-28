// package Level2.HashMapAndHeap;



// import java.util.*;

// public class DividedIntoPairs{
	
// 	public static void solution(int[] arr, int k){
// 		//write your code here
// 		HashMap<Integer,Integer> map=new HashMap<>();
		
		
		
// 		for(int i=0;i<arr.length;i++){
// 		    int val=arr[i]%k;
		    
// 		    if(map.containsKey(val)==true){
// 		        int v=map.get(val);
// 		        map.put(val,v+1);
// 		    }else{
// 		        map.put(val,1);
// 		    }
		    
// 		}
		
// 		for(int val:map.keySet()){
		    
// 		    if(k%2==0&&val==k/2||val==0){
		        
// 		       if(map.get(val)%2!=0){
// 		            System.out.println("false");
// 		           return;
// 		        }
		        
// 		    }else{
// 		        int v1=map.get(val);
// 		        int v2=map.getOrDefault(k-val,-1);
		        
// 		        if(v1!=v2||v2==-1){
// 		            System.out.println("false");
// 		           return;
// 		        }
		        
		        
// 		    }
		   
		           
// 		}
		
// 		 System.out.println("true");

// 	}

// 	public static void main(String[] args) {
// 		Scanner scn = new Scanner(System.in);
// 		int n = scn.nextInt();
// 		int[] arr = new int[n];
// 		for(int i = 0 ; i < n; i++){
// 			arr[i] = scn.nextInt();
// 		}
// 		int k = scn.nextInt();
// 		solution(arr,k);
// 	}

// }
