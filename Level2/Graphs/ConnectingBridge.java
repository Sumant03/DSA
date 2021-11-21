// class Solution {
//     int[] dis;
//     int[] low;
//    int time;

   
//    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
   
       
//        ArrayList<Integer>[] graph=new ArrayList[n];
       
       
//        for(int i=0;i<graph.length;i++){
//            graph[i]=new ArrayList<>();
//        }
       
       
//        for(int i=0;i<connections.size();i++){
//            int u=connections.get(i).get(0);
//            int v=connections.get(i).get(1);
           
//            graph[u].add(v);
//            graph[v].add(u);
           
           
           
          
//        }
//         List<List<Integer>> ans=new ArrayList<>();
           
//            boolean[] vis=new boolean[n];
//            dis=new int[n];
//            low=new int[n];
//            time=0;
//            bridge(graph,0,-1,vis,ans);
//        return ans;
//    }
//    public void bridge(ArrayList<Integer>[] graph,int src,int par,boolean[] vis,List<List<Integer>> ans){
//       vis[src]=true;
//        dis[src]=low[src]=time;
//        time++;
       
//        for(int nbr:graph[src]){
           
//            if(src==par){
               
//            }else if(vis[nbr]==false){
//                low[src]=Math.min(low[nbr],low[src]);
//            }else if(vis[nbr]==true){
//                low[src]=Math.min(dis[src],low[nbr]);
//            }
           
//            if(dis[src]<low[nbr]){
//                ArrayList<Integer> abc=new ArrayList<>();
//                abc.add(src);
//                abc.add(nbr);
               
//                ans.add(abc);
//            }
//        }
       
       
       
       
       
       
       
       
//    }
   
   
// }
