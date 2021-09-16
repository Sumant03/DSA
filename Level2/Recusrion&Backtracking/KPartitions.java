
import java.io.*;
import java.util.*;

public class KPartitions{
    static int count=0;
	public static void solution(int i, int n, int k, int rssf, ArrayList<ArrayList<Integer>> ans) {
		//write your code here
		if(i>n){
		    if(rssf==k){
		        count++;
		        System.out.print(count+". ");
		        for(ArrayList<Integer> set:ans){
		            System.out.print(set+" ");
		        }
		        System.out.println();
		    }
		    return;
		}
		
	    
	    
	    for(ArrayList<Integer> set :ans){
	        if(set.size()>0){
	            set.add(i);
	            solution(i+1,n,k,rssf,ans);
	            set.remove(set.size()-1);
	        }else{
	            set.add(i);
	            solution(i+1,n,k,rssf+1,ans);
	            set.remove(set.size()-1);
	            break;
	        }
	    }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i  = 0; i < k; i++) {
			ans.add(new ArrayList<>());
		}
		solution(1, n, k, 0, ans);

	}

}
