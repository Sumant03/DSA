//almost done , only the union vala code is left ;




// package Level2.Graphs;

// public class RedundantConnectionII {
    
// }


// class Solution {
//     int[] par;
//     int[] rank;
    
//     public int[] findRedundantDirectedConnection(int[][] edges) {
//         int n=edges.length;
        
    
    
//         int[] in=new int[n];
//         Arrays.fill(in,-1);
        
//         int[] b1=-1;
//         int[] b2=-1;
        
//         for(int i=0;i<edges.length;i++){
//             int u=edges[i][0];
//             int v=edges[i][1];
            
//             if(in[v]==-1){
//                 in[v]=i;
//             }
//             else{
//                 b1=in[v];
//                 b2=i; 
//                 break;
//             }
            
//         }
//         if(b1==-1){
//             //case 1
//            int ei= dsu();
//             return edges[ei];
//         }else{
//             // case 2, case 3
            
//           int ei=  dsu(b2);
            
//             if(ei==-1){
//                 return edges[b2];
//             }else{
//                 return edges[b1];
//             }
//         }
//     }
    
//     public int find(int x){
//         if(par[x]==x){
//             return x;
//         }else{
//             int ans=find(par[x]);
//             par[x]=ans;
//             return ans;
//        }
//     }
    
//     public boolean union(int u,int v){
//         int lu=find(u);
//         int lv=find(v);
        
//         if(lv!=lu){
//         if(rank[lu]<rank[lv]){
//             par[lu]=lv;
//         }else if(rank[lu]>rank[lv]){
//             par[lv]=lu;
//         }else{
//             par[lu]=lv;
//             rank[lv]++;
//         }
//         }else{
//             return false;
//         }
        
//     }
//     //black listed index 
//     public static int dsu(int bli,int[][],edges){
//         int n=edges.length;
//         par=new int[n];
//         rank=new int[n];
        
//         for(int i=0;i<n;i++){
//             par[i]=i;
//             rank[i]=0;
//         }
        
//         for(int i=0;i<edges.length;i++){
//             if(bli==i){
//                 continue;
//             }
            
//             int u=edges[i][0];u--;
//             int v=edges[i][1];v--;
            
//             boolean temp=union(u,v);
            
//             if(temp==false){
//                 return i;
//             }
            
            
//         }
        
//         return -1;
        
//     }
// }
