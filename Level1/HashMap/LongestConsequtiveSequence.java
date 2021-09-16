

// // import java.io.*;
// import java.util.*;

// public class LongestConsequtiveSequence{
// static int osp=0;
// static int ocount=0;
// public static void main(String[] args) throws Exception {
//     // write your code here
    
//     Scanner scn=new Scanner(System.in);
//     int n1=scn.nextInt();
//     int arr1[]=new int[n1];
      
//     for(int i=0;i<n1;i++){
//         arr1[i]=scn.nextInt();
//     }
    
    
//     scn.close();
//     HashMap<Integer,Boolean> hm=new HashMap<>();
     
    
//   hm.put(arr1[0],true);
//     for(int i =1;i<n1;i++){
  
        
//      if(!hm.containsKey(arr1[i])){
    
//          hm.put(arr1[i],true);
//      }   
        
        
//     }
    
    
//     for(int key:hm.keySet()){
  
        
//      if(!hm.containsKey(key-1)){
//        hm.put(key,false);
         
//      }   
        
        
//     }
    
    
//     for(int key:hm.keySet()){
  
        
//      if(!hm.containsKey(key-1)){
//        hm.put(key,false);
         
//      }   
        
        
//     }
    
//     for(int key:hm.keySet()){
  
        
//      if(hm.get(key)==true){
//       int count=1;
//       int i=0;
//       while(hm.containsKey(key+i)){
//           count++;
//           i++;
//          }
         
//          if(count>ocount){
//              ocount=count;
//              osp=key-1;
//          }
      
         
//      }   
        
        
//     }
//     // System.out.println(osp);
//     // System.out.println(ocount);
//     for(int i=0;i<ocount;i++){
        
//         System.out.println(osp+i);
//     }
    
    
    
//  }

// }