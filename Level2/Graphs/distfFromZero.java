// class Solution {
//     public static class Pair{
//         int i;
//         int j;
//         Pair(){
            
//         }
//         Pair(int i,int j){
//             this.i=i;
//             this.j=j;
//         }
//     }
    
//     public int[][] updateMatrix(int[][] mat) {
        
//         ArrayDeque<Pair> q=new ArrayDeque<>();
        
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[0].length;j++){
//                 if(mat[i][j]==0){
//                      q.add(new Pair(i,j));            
//                 }
//             }
//         }
        
//         int[][] dist=new int[mat.length][mat[0].length];
//          int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};
//         while(q.size()>0){
//             Pair rem=q.remove();
            
            
//              for(int k=0;k<4;k++){
//                 int ni=rem.i+dir[k][0];
//                 int nj=rem.j+dir[k][1];
                
//                 if(ni>=0&&ni<mat.length&&nj>=0&&nj<mat[0].length&&mat[ni][nj]==1){
//                     q.add(new Pair(ni,nj));
//                     mat[ni][nj]=-1;
//                     dist[ni][nj]=dist[rem.i][rem.j]+1;
                
//                 }
//             }
            
            
//         }
        
//         return dist;
        
        
        
//     }
// }