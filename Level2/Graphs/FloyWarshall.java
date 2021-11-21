// Integer.MAX_VALUEpackage Level2.Graphs;

// public class FloyWarshall {
    
// }
// class Solution
// {
//     public void shortest_distance(int[][] matrix)
//     {
//         // Code here 
        
//         int n=matrix.length;
//         int m=matrix[0].length;
        
//         int cost[][]=new int[n][m];
        
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==-1){
//                     cost[i][j]=Integer.MAX_VALUE;
//                 }else{
//                     cost[i][j]=matrix[i][j];
//                 }
//             }
//         }
//         for(int k=0;k<n;k++){
//             for(int u=0;u<n;u++){
//                 for(int v=0;v<m;v++){
                    
//                if(u!=k&&v!=k&&cost[u][k]!=Integer.MAX_VALUE&&cost[k][v]!=Integer.MAX_VALUE){
//                    cost[u][v]=Math.min(cost[u][v],cost[u][k]+cost[k][v]);
                   
//                }
//                 }
//             }
//         }
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(cost[i][j]==Integer.MAX_VALUE){
//                     matrix[i][j]=-1;
//                 }else{
//                     matrix[i][j]=cost[i][j];
//                 }
//             }
//         }
        
        
        
//     }
// }