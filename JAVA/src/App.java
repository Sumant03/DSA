// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Step one");
//         System.out.println("After Scanner");
//         String wow=in.nextLine();

//         System.out.println(wow);
      
//         in.close();
//         // System.out.println("After Scanner");
//     }
// }
// import java.io.*;
// import java.util.*;

// public class App {

//     public static void main(String[] args) throws Exception {
//      Scanner scn=new Scanner(System.in);
//      int n=scn.nextInt();
//      ArrayList<String> str=getStairPaths(n);
//      System.out.println(str);
//      scn.close();
//     }

//     public static ArrayList<String> getStairPaths(int n) {
//     if(n==0){
//         ArrayList<String> r=new ArrayList<>();
//         r.add("");
//         return r;
//     }
//      if(n<0){
//         ArrayList<String> r=new ArrayList<>();
//         return r;
//     }
    
//     ArrayList<String> res=new ArrayList<>();    
//     ArrayList<String> str1=getStairPaths(n-1);
    
// ArrayList<String> str2=getStairPaths(n-2);
    
//     ArrayList<String> str3=getStairPaths(n-3);
    
//     for(String s:str1){
//         res.add("1"+s);
//     }
//         for(String s:str2){
//         res.add("2"+s);
//     }
//         for(String s:str3){
//         res.add("3"+s);
//     }
//     return res;
//     }

// }


import java.io.*;
import java.util.*;

public class App {
 

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner scn=new Scanner(System.in);
         int idx=scn.nextInt();
        int[] arr=new int[idx];
        for(int i=0;i<idx;i++){
            arr[i]=scn.nextInt();
        }
        
        System.out.println( maxOfArray(arr,idx));
    }
    
    public static int maxOfArray(int[] arr, int idx){
        if(idx==0){
            return arr[idx];
        }
        int misa=maxOfArray(arr,idx-1);
        if(misa>arr[idx-1]){
            return misa;
        }else{
            return arr[idx-1];
        }
        
    }

}