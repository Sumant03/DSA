
// import java.io.*;
// import java.util.*;

// public class Main {

//   public static void Combination2 (int[] boxes, int ci, int ti, int lb){
//     // write your code here
//       if(ci>ti){
//         for(int v:boxes){
         
//             System.out.print(v!=0?"i":"-");
//         }
//         System.out.println();
//         return;
//     }
    
//      for(int idx=lb+1;idx<boxes.length;idx++){
         
//         boxes[idx]=1;
//      combinations(boxes,ci+1,ti,idx);
//         boxes[idx]=0;
    
//     }
    
//   }

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     int nboxes = Integer.parseInt(br.readLine());
//     int ritems = Integer.parseInt(br.readLine());
//     combinations(new int[nboxes], 1, ritems, -1);
//   }

// }

