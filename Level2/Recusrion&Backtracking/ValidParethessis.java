

// import java.io.*;
// import java.util.*;

// public class ValidParethessis {

// 	public static void solution(String str, int minRemoval, HashSet<String> ans) {
// 		//write your code here
// 		if(minRemoval==0){
// 		    if(isbalanced(str)&&ans.contains(str)==false){
// 		 System.out.println(str);
// 		 ans.add(str);
		        
// 		    }
		 
// 		 return;
// 		}
		
		
// 		StringBuilder s= new StringBuilder<>(str);
// 		for(int i=0;i<str.length();i++){
// 		   s.deleteCharAt(i);
// 		   solution(s.toString(),minRemoval-1,ans);
//            s.insert(i,str.charAt(i));
	       
// 	}

// 	public static int getMin(String str){
// 		//write your code here
	
// 	Stack<Character> st=new Stack<>();
	
// 	for(int i=0;i<str.length();i++){
	    
// 	    char ch=str.charAt(i);
	    
// 	    if(ch=='('){
// 	        st.push(ch);
// 	    }else if(ch==')'){
	        
// 	        if(st.size()==0&&st.peek()!='('){
// 	            st.push(ch);
// 	            continue;
// 	        }
// 	            st.pop();
	        
// 	    }
	    
	 
	    
// 	}
// 	   return st.size();
// 	}
	
// 	public static boolean isbalanced(String str){
	    
// 	 	Stack<Character> st=new Stack();
	
// 	for(int i=0;i<str.length();i++){
	    
// 	    char ch=str.charAt(i);
	    
// 	    if(ch=='('){
// 	        st.push(ch);
// 	    }else if(ch==')'){
	        
// 	        if(st.size()==0){
// 	            st.push(ch);
// 	        }else{
// 	            st.pop();
// 	        }
// 	    }
// 	}
// 	   if(st.size()>0){
// 	       return false;
// 	   }else{
// 	       return true;
// 	   }  
	    
// 	}
	
// 	public static void main(String[] args) {
// 		Scanner scn = new Scanner(System.in);
// 		String str = scn.next();
// 		solution(str, getMin(str),new HashSet<>());
// 	}
		
// }