
// // import java.io.*;
// import java.util.*;

// public class getCommon2{

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
//     HashMap<Integer,Integer> hm1=new HashMap<>();

    
//   hm1.put(arr1[0],1);
//     for(int i =1;i<n1;i++){
  
        
//      if(hm1.containsKey(arr1[i])){
         
//          int val=hm1.get(arr1[i]);
//          hm1.put(arr1[i],val+1);
//      }else{
//          hm1.put(arr1[i],1);
//      }    
        
        
//     }
    
    
     
    
     
//    for(int i=0;i<arr2.length;i++){
    
//     if(hm1.containsKey(arr2[i])&&hm1.get(arr2[i])>0){
//         System.out.println(arr2[i]);
//         hm1.put(arr2[i],hm1.get(arr2[i])-1);
//     }
       
//      if(hm1.size()==0) return;  
       
//    }
    
    
//  }

// }