
// import java.io.*;
// import java.util.*;

// public class  djikstra {
//   static class Edge {
//     int src;
//     int nbr;
//     int wt;

//     Edge(int src, int nbr, int wt) {
//       this.src = src;
//       this.nbr = nbr;
//       this.wt = wt;
//     }
//      public static class Pair implements Comparable<Pair> {
//     int vtx,wsf;
    
//     String psf;
//     Pair(int cvt, String psf, int val) {
//       this.vtx = vtx;
//       thi.psf=psf;
//       this.wsf = wsf;
//     }

//     public int compareTo(Pair o) {
//       return this.wsf - o.wsf;
//     }
//   }
 
//  public static void path(ArrayList<Edge>[] graph,int src){
//          PriorityQueue<Pair> pq=new PriorityQueue<>();
//          boolean visited[]=new boolean[graph.length];
//          pq.add(new Pair(src,""+src,0));
         
//          while(pq.size()>0){
//              Pair temp=pq.remove();
//              if(visited[temp.vtx]==false){
//                  visited[temp.vtx]=true;
                 
// System.out.println(temp.vtx+" via "+temp.psf+"@"+temp.wsf);
                     
                     
//                      for(Edge e:graph[temp.vtx]){
//                          if(visited[e.nbr]==false){
//                              pq.add(new Pair(e.nbr,temp.psf+e.nbr,temp.wsf+e.wt));
//                          }
//                      }
//                  }
//              }
//          }
//    }
   
//   }

 


//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     int vtces = Integer.parseInt(br.readLine());
//     ArrayList<Edge>[] graph = new ArrayList[vtces];
//     for (int i = 0; i < vtces; i++) {
//       graph[i] = new ArrayList<>();
//     }

//     int edges = Integer.parseInt(br.readLine());
//     for (int i = 0; i < edges; i++) {
//       String[] parts = br.readLine().split(" ");
//       int v1 = Integer.parseInt(parts[0]);
//       int v2 = Integer.parseInt(parts[1]);
//       int wt = Integer.parseInt(parts[2]);
//       graph[v1].add(new Edge(v1, v2, wt));
//       graph[v2].add(new Edge(v2, v1, wt));
//     }

//     int src = Integer.parseInt(br.readLine());
//     // write your code here
//     path(graph,src);
//   }
// }