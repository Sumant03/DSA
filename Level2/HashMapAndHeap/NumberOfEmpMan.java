// package Level2.HashMapAndHeap;

// public class NumberOfEmpMan {
    
// }
// All test cases except the one at the beginning pf checking the value if null or length =0;


// package Level2.Graphs;


// import java.util.*;
// import java.io.*;

// public class NoOfIslanfTwoUsingDsu {
//   public static void main(String[] args) throws NumberFormatException, IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String[] st = br.readLine().split(" ");
//     int m = Integer.parseInt(st[0]);
//     int n = Integer.parseInt(st[1]);
//     int q = Integer.parseInt(st[2]);

//     int[][] pos = new int[q][2];
//     for (int i = 0; i < q; i++) {
//       st = br.readLine().split(" ");
//       pos[i][0] = Integer.parseInt(st[0]);
//       pos[i][1] = Integer.parseInt(st[1]);
//     }

//     System.out.println(numIslands2(m, n, pos));
//   }
//   static int[] par;
//   static int[] rank;
//   public static List<Integer> numIslands2(int m, int n, int[][] positions) {
   
//    List<Integer> ans=new ArrayList<>();
 
   
   
//    int[][] mat=new int[m][n];
//    par=new int[n*m];
//    rank=new int[n*m];
   
//    for(int i=0;i<m*n;i++){
//        par[i]=i;
//        rank[i]=0;
       
//    }
   
//     int count=0;
//     int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};
    
     
//    for(int k=0;k<positions.length;k++){
//        int i=positions[k][0];
//        int j=positions[k][1];
       
//        if(mat[i][j]==1){
//            ans.add(count);
//            continue;
//        }
       
//     mat[i][j]=1;
//     count++;
    
    
//     for(int d=0;d<4;d++){
        
//         int ni=i+dir[d][0];
//         int nj=j+dir[d][1];
        
//         if(ni>=0&&ni<m&&nj>=0&&nj<n&&mat[ni][nj]==1){
//         int src=i*n+j;
//         int nbrc=ni*n+nj;
        
//         int ls=find(src);
//         int ln=find(nbrc);
        
        
//         if(ls!=ln){
//             if(rank[ls]<rank[ln]){
//                 par[ls]=ln;
//             }else if(rank[ls]>rank[ln]){
//                 par[ln]=ls;
//             }else{
//                 par[ln]=ls;
//                 rank[ls]++;
//             }
//             count--;
//         }
        
        
//     }
//     }
//   ans.add(count);
//  }    
//    return ans;
//  } 
 
//     public static int find(int x) {
//         if(par[x] == x) {
//             return x;
//         }
//         else {
//             int ans = find(par[x]);
//             par[x] = ans; //path compression step
//             return ans;
//         }
//     }
// }