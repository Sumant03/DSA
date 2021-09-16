

import java.io.*;
import java.util.*;

public class Lexicographically {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        
           for(int i=1;i<=9;i++){
	            solve(i,n);
	        }
		//write your code here
	}
	
	public static void solve(int num,int n){
	    if(num>n){
	        return;
	    }
	    System.out.println(num);
	    
	    for(int i=0;i<=9;i++){
	        int newNum=(num*10)+i;
	        if(newNum<=n){
	            solve(newNum,n);
	        }
	    }
	}
	
	
	
	
	
	
	
	
}
