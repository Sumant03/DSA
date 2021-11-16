// public class Kosaraju {

  
//         public static void dfs(int src,ArrayList<ArrayList<Integer>>graph ,boolean[] vis ,Stack st){
            
//             vis[src]=true;
//             for(int nbr:graph.get(src)){
//                 if(vis[nbr]==false){
//                     dfs(nbr,graph,vis,st);
//                 }
//             }
//             st.push(src);
//         }
//         public static void dfs(ArrayList<ArrayList<Integer>>graph ,boolean[] vis,int s){
            
//             vis[s]=true;
//             for(int nbr:graph.get(s)){
//                 if(vis[nbr]==false){
//                     dfs(graph,vis,s);
//                 }
//             }
            
//         }
//         //Function to find number of strongly connected components in the graph.
//         public int kosaraju(int V, ArrayList<ArrayList<Integer>> graph)
//         {
//             //code here
            
//             // 1.Do dfs and fill stack in postorder
//         Stack<Integer> st=new Stack<>();
//         boolean[] vis=new boolean[V];
            
//             for(int i=0;i<V;i++){
//                 if(vis[i]==false){
//                     dfs(i,graph,vis,st);
//                 }
//             }
            
            
//             //2 . reverse graph
            
//             ArrayList<ArrayList<Integer>> revGraph=new ArrayList<>();
//             for(int i=0;i<V;i++){
//                 ArrayList<Integer> list=new ArrayList<>();
//                 revGraph.add(list);
//             }
            
//             for(int i=0;i<V;i++){
//                 for(int nbr:graph.get(i)){
//                     revGraph.get(nbr).add(i);
//                 }
//             }
            
//             //3. dfs on reversedgraph using order of stack and count the nom of times we are executing the code .
            
//             vis=new boolean[V];
//             int scc=0;
            
//             while(st.size()!=0){
//                 int s=st.pop();
                
//                 if(vis[s]==false){
//                     dfs(graph,vis,s);
//                     scc++;
//                 }
//             }
            
//             return scc;
        
//         }
        
        
//     }
        

