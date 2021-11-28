// package Level2.HashMapAndHeap;

// public class Itinery {
    
// }
// package Level2.Graphs;

// public class Itinery {
    
// }
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
		    
// 		   if(map.containsKey(src)==false){
		    
// 		       tf.put(src,true);
// 		   }else{

// 		       tf.put(src,tf.get(src)); 
// 		   }
// 		      tf.put(dest,false);
		    
// 		}
		
// 		String head="";
// 		for(String src:tf.keySet()){
// 		    if(tf.get(src)==true){
// 		        head=src;
// 		        break;
// 		    }
// 		}
		
		
// // 		print(head,map);
		
		
// 		while(map.containsKey(head)==true){
// 		    System.out.print(head+" -> ");
// 		    head=map.get(head);
// 		}
// 		System.out.print(head+".");
		



// 	}
// 	public static void print(String src,HashMap<String,String> map){
// 	        if(map.get(src)==""){
// 		        return;
// 		    }
		    
		    
// 		    System.out.println(map.get(src)+" "+"->");
// 		    print(map.get(src),map);
// 	}
// }

