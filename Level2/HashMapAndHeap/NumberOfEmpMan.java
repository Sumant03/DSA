// import java.io.*;
// import java.util.*;

// public class Main {
  
//   public static void main(String[] args){
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
    
//     //write your code here
//     HashMap<String,String> map=new HashMap<>();
    
//     while(n-->0){
        
//         String emp=scn.next();
//         String man=scn.next();
        
//         map.put(emp,man);
//     }
    
//     HashMap<String,ArrayList<String>> gt=new HashMap<>();
//     String ceo="";
//     for(String emp:map.keySet()){
//         String man=map.get(emp);
        
        
//         if(emp.equals(man)==true){
//             ceo=emp;
//             ArrayList<String> list=gt.getOrDefault(man,new ArrayList<>());
//             gt.put(emp,list);
//             continue;
//             }       
//             ArrayList<String> list=gt.getOrDefault(man,new ArrayList<>());
//             list.add(emp);
//             gt.put(man,list);
                
//     }
    
    
//     HashMap<String,Integer> ans=new HashMap<>();
    
//     size(ceo,gt,ans);
    
    
//           for(String src:ans.keySet()){
//           System.out.println(ans.get(src));
//       }
    
//   }

//   public static int size(String ceo,HashMap<String,ArrayList<String>> gt,HashMap<String,Integer> ans){
      
//       int s=0;
      
      
//       for(String src:gt.keySet()){
//         int cs=size(gt.get(src),gt,ans);
//         s+=cs;
//       }
//       ans.put(ceo,s);
//       return s+1;
//   }
// }