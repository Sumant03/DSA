
// // import java.io.*;
// import java.util.*;

// public class getCommon1{

// public static void main(String[] args) throws Exception {
//     // write your code here
    
//     Scanner scn=new Scanner(System.in);
//     int n1=scn.nextInt();
//     int arr1[]=new int[n1];
      
//     for(int i=0;i<n1;i++){
//         arr1[i]=scn.nextInt();
//     }
    
    
//     int n2=scn.nextInt();
//     int arr2[]=new int[n2];
    
//     for(int i=0;i<n2;i++){
//         arr2[i]=scn.nextInt();
//     }
//     scn.close();
//     HashMap<Integer,Integer> hm=new HashMap<>();
     
    
//   hm.put(arr1[0],1);
//     for(int i =1;i<n1;i++){
  
        
//      if(hm.containsKey(arr1[i])){
         
//          int val=hm.get(arr1[i]);
//          hm.put(arr1[i],val+1);
//      }else{
//          hm.put(arr1[i],1);
//      }    
        
        
//     }
//       System.out.println("--------------");   
//     for(int i=0;i<n2;i++){
//     if(hm.size()==0){
//         return;
//     }    
    
//     int val=arr2[i];
//       if(hm.containsKey(val)){
//           System.out.println(val);
//           hm.remove(val);
//       }
//     }
    
    
    
//  }

// }