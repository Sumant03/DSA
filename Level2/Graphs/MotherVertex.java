 package Level2.Graphs;

// public class MotherVertex {
    
// }
// class Solution {
    
//     public static class Pair{
//         int i ;
//         int j;
//         Pair(){
            
//         }
//         Pair(int i,int j){
//             this.i=i;
//             this.j=j;
//         }
//     }
//     public int shortestBridge(int[][] grid) {
        
//         ArrayDeque<Pair> q=new ArrayDeque<>();
//         boolean flag=true;
//         for(int i=0;i<grid.length&&flag==true;i++){
//             for(int j=0;j<grid[0].length;j++){
                
//                 if(grid[i][j]==1){
//                     dfs(grid,i,j,q);
//                     break;
//                 }
             
//             }
//         }
        
//         while(q.size()>0){
//            int count=q.size();
            
//             for(int i=0;i<count;i++){
//                 Pair rem =q.remove();
                    
                    
//        for(int k=0;k<4;k++){
//             int ni=i+dir[k][0];
//             int nj=j+dir[k][1];
            
//       if(ni>=0&&ni<mat.length&&nj>=0&&nj<mat[0].length&&mat[ni][nj]==0){
//          if(grid[ni][nj]==1){
//              return lvl;
//          }else if(grid[ni][nj]==0){
//              q.add(new Pair(ni,nj));
//              grid[ni][nj]=-1;
//          }
            
//         }
//         }              
          
        
//         }
//         lvl++;    
//         }
//         return lvl;
        
//     }
// static int[][]dir={{-1,0},{0,-1},{1,0},{0,1}};
    
//     public static void dfs(int[][] grid,int i,int j ,ArrayDeque<Pair> q){
//         if(ni>=0&&ni<mat.length&&nj>=0&&nj<mat[0].length&&mat[ni][nj]==0){
//             return;
//         }
//         q.add(new Pair(i,j));
//         grid[i][j]=-1;
        
//         for(int k=0;k<4;k++){
//             int ni=i+dir[k][0];
//             int nj=j+dir[k][1];
            
// if(ni>=0&&ni<mat.length&&nj>=0&&nj<mat[0].length&&mat[ni][nj]==0){
//              dfs(grid,ni,nj,q);        
//               }
        
//     }
// }
