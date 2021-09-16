
// import java.io.*;
// import java.util.*;

// public class mst {
//    static class Edge {
//       int src;
//       int nbr;
//       int wt;

//       Edge(int src, int nbr, int wt) {
//          this.src = src;
//          this.nbr = nbr;
//          this.wt = wt;
//       }
//    }

//      public static class Pair implements Comparable<Pair>{
//       int cvt,pvt,wt;
//       Pair(int cvt,int pvt,int val){
//           this.cvt = cvt;
//           this.pvt = pvt;
//           this.wt = wt;
//       }
      
//       public int compareTo(Pair o){
//           return this.wt - o.wt;
//       }
//   }

//    public static void mst(ArrayList<Edge>[] graph){
//          PriorityQueue<Pair> pq=new PriorityQueue<>();
//          boolean visited[]=new boolean[graph.length];
//          pq.add(new Pair(0,-1,0));
         
//          while(pq.size()>0){
//              Pair temp=pq.remove();
//              if(visited[temp.cvt]==false){
//                  visited[temp.cvt]=true;
                 
//                  if(temp.pvt!=-1){
//                      System.out.println("["+temp.cvt+"-"+temp.pvt+"@"+temp.wt+"]");
                     
                     
//                      for(Edge e:graph[temp.cvt]){
//                          if(visited[e.nbr]==false){
//                              pq.add(new Pair(e.nbr,temp.cvt,e.wt));
//                          }
//                      }
//                  }
//              }
//          }
//    }
   
   
   
//    public static void main(String[] args) throws Exception {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//       int vtces = Integer.parseInt(br.readLine());
//       ArrayList<Edge>[] graph = new ArrayList[vtces];
//       for (int i = 0; i < vtces; i++) {
//          graph[i] = new ArrayList<>();
//       }

//       int edges = Integer.parseInt(br.readLine());
//       for (int i = 0; i < edges; i++) {
//          String[] parts = br.readLine().split(" ");
//          int v1 = Integer.parseInt(parts[0]);
//          int v2 = Integer.parseInt(parts[1]);
//          int wt = Integer.parseInt(parts[2]);
//          graph[v1].add(new Edge(v1, v2, wt));
//          graph[v2].add(new Edge(v2, v1, wt));
//       }

//       // write your code here
//       mst(graph);
//    }

// }



































// // import java.io.*;
// import java.util.*;

// public class Main {
//    static class Edge {
//       int src;
//       int nbr;
//       int wt;

//       Edge(int src, int nbr, int wt) {
//          this.src = src;
//          this.nbr = nbr;
//          this.wt = wt;
//       }
//    }
   
//    public static class Pair implements Comparable<Pair>{
//       int cvt,pvt,val;
//       Pair(int cvt,int pvt,int val){
//           this.cvt = cvt;
//           this.pvt = pvt;
//           this.val = val;
//       }
      
//       public int compareTo(Pair o){
//           return this.val - o.val;
//       }
//   }
  
//   public static void minimumCost(ArrayList<Edge>[] graph){
     
//     boolean visited[]=new boolean[graph.length];
//       // write your code here
//    PriorityQueue<Pair> pq=new PriorityQueue<>();
//     pq.add(new Pair(0,-1,0));
//     printPath(graph,pq,visited);
  
//    }
   
//    public static void printPath(ArrayList<Edge>[] graph,PriorityQueue<Pair> pq,boolean visited[]){
       
       
       
//        while(pq.size()>0){
//            Pair p=pq.remove();
//            if(visited[p.cvt]==false){
//            if(p.pvt!=-1){
//                System.out.println("["+p.cvt+"-"+p.pvt+"@"+p.val+"]");
//            }
           
           
//     for(Edge e:graph[p.cvt]){
//            if(!visited[e.nbr]){
//                visited[e.nbr]=true;
//               pq.add(new Pair(e.nbr,p.cvt,e.wt));         
//            }
//        }
//            }
           
//        }
       
//    }
 

//    public static void main(String[] args) throws Exception {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//       int vtces = Integer.parseInt(br.readLine());
//       ArrayList<Edge>[] graph = new ArrayList[vtces];
//       for (int i = 0; i < vtces; i++) {
//          graph[i] = new ArrayList<>();
//       }

//       int edges = Integer.parseInt(br.readLine());
//       for (int i = 0; i < edges; i++) {
//          String[] parts = br.readLine().split(" ");
//          int v1 = Integer.parseInt(parts[0]);
//          int v2 = Integer.parseInt(parts[1]);
//          int wt = Integer.parseInt(parts[2]);
//          graph[v1].add(new Edge(v1, v2, wt));
//          graph[v2].add(new Edge(v2, v1, wt));
//       }


//       minimumCost(graph);
    
//       // write your code here
//    }

// }