// class Solution {
//     int[] par;
//     int[] rank;
    
//     public int find()
//     public int[] findRedundantConnection(int[][] edges) {
//         int n=edges.length;
//         par=new int[n];
//         rank=new int[n];
        
//         for(int i=0;i<edges.length;i++){
//             parent[i]=i;
//             rank[i]=0;
//         }
        
//         for(int i=0;i<edges.length;i++){
//             int u=edges[i][0]; u--;
//             int v=edges[i][1]; v--;
//             int lu=find(u);
//             int lv=find(v);
            
//             if(lu!=lv){
//                 if(rank[lu]<rank[lv]){
//                     par[lu]=lv;
//                 }else if(rank[lv]>rank[lu]){
//                     par[lv]=lu;
//                 }else{
//                     parent[lu]=lv;
//                     rank[lv]++;
//                 }
//             }else{
//                 return edges[i];
//             }
//         }
//         int[] arr={0,0};
//         return arr;
//     }
// }