// import java.util.*;

// public class Main {

//     public static void main(String args[]){
//  Scanner scn=new Scanner(System.in);
//  int vertices=scn.nextInt();
//  int edges=scn.nextInt();
//  ArrayList<>[]  graph =new ArrayList[vertices];
 
//  for(int i=0;i<vertices;i++){
//      graph[i]=new ArrayList<Edge>();
//  }

//  for(int j=0;i<edges;i++){
//      int v1=scn.nextInt();
//      int v2=scn.nextInt();
//      int wt=scn.nextInt();

//      graph[v1].add(new Edge(v1,v2,wt));
//      graph[v2].add(new Edge(v2,v1,wt));
//  }

//  display(graph);
// }
//  public static class Edge{
//      int src,dest,wt;

//      Edge(int src,int dest,int wt){
//          this.src=src;
//          this.dest=dest;
//          this.wt=wt;
//      }
//  }


//  public static void display(ArrayList<Edge>[] graph){
//      int vertices=graph.length;
//      for(int i=0;i<vertices;i++){
//          ArrayList<Edge> list=graph[i];
//          System.out.print(i+" -> ");
//          for(Edge e:list){
//              System.out.print(e.dest+" ");
//          }
//          System.out.println();
//      }
//  }
// }

// import java.util.ArrayList;
// import java.util.Scanner;
 
// public class Main {
//     public static class Edge{
//         int src,nbr,wt;
//         Edge(int src,int nbr,int wt){
//             this.src = src;
//             this.nbr = nbr;
//             this.wt = wt;
//         }
//     }
//     public static void display(ArrayList<Edge>[] graph){
//         int vtces = graph.length;
//         for(int i = 0 ; i < vtces ; i++){
//             ArrayList<Edge> list = graph[i];
//             System.out.print(i+" -> ");
//             for(Edge e : list){
//                 System.out.print(e.nbr+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner  scn = new Scanner(System.in);
 
//         int vtces = scn.nextInt();
//         int edges = scn.nextInt();
 
//         ArrayList<Edge>[] graph = new ArrayList[vtces];
 
//         for(int i = 0 ; i < vtces ; i++){
//             graph[i] = new ArrayList<Edge>();
//         }
 
//         for(int i = 0 ; i < edges ; i++){
//             int v1 = scn.nextInt();
//             int v2 = scn.nextInt();
//             int wt = scn.nextInt();
 
//             graph[v1].add(new Edge(v1,v2,wt));
//             graph[v2].add(new Edge(v2,v1,wt));
//         }
 
//         display(graph);        
//       scn.close();
//     }
// }