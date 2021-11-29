// import java.util.*;

// public class Main {
// 	public static void main(String[] args) {
// 		Scanner scn = new Scanner(System.in);
// 		int noofpairs_src_des = scn.nextInt();
// 		HashMap<String, String> map = new HashMap<>();
// 		for (int i = 0; i < noofpairs_src_des; i++) {
// 			String s1 = scn.next();
// 			String s2 = scn.next();
// 			map.put(s1, s2);	
// 		}
		

// 		//write your code here
// 		HashMap<String,Boolean> tf=new HashMap<>();
		
// 		for(String src:map.keySet()){
// 		    String dest=map.get(src);
		    
// 		   if(tf.containsKey(src)==false){
		    
// 		       tf.put(src,true);
// 		   }else{

// 		       tf.put(src,tf.get(src)); 
// 		   }
// 		      tf.put(dest,false);
// 		  }
		

		
		
		
// 		String head="";
// 		for(String src:tf.keySet()){
// 		    Boolean val=tf.get(src);
		  
// 		    if(val==true){
// 		        head=src;
// 		        break;
// 		    }
// 		}

		
// 		while(map.containsKey(head)==true){
// 		    System.out.print(head+" -> ");
// 		    head=map.get(head);
// 		}
// 		System.out.print(head+".");
		



// 	}

// }
