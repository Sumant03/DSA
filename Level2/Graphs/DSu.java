// BruteForceApproach for DSU




// import java.util.*;

// public class Main{
//        static int[] par;
//     public static void main(String args[]){
//         int[][] rel={{1,2},{4,5},{2,6},{3,7},{9,10},{6,8},{3,5},{10,11}};
//         int n=11;

//         par=new int[n+1];


//         //filling parent array using that number itself ;
//         for(int i=1;i<=n;i++){
//                 par[i]=i;
//         }


//         for(int idx=0;idx<rel.length;idx++){
//             int x=rel[idx][0];
//             int y=rel[idx][1];


//             union(x,y);
//         }
//        int gc=0;

//        for(int idx=1;idx<n;idx++){
//            if(par[idx]==idx){
//                gc++;
//            }
//        }
//        System.out.println(gc);
//     }

//     //it takes two values find their parent respectively and add them as a parent child relation
//     public static void union(int x,int y){

//      int lx=find(x);
//      int ly=find(y);

//      par[ly]=lx;
//   }
//    public static int find(int val){
          
//     if(par[val]==val){
//         return val;
//     }else{
//         int v =find(par[val]);
            //par[val]=v;
          //  return v;
//     }
//    }


// }








// 1st optimization , store the value of leader in parent array itself and reduce recusion time 