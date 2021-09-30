package Level2.Trees;

public class bstusingLevelorder {
    
}

// class GFG 
// {
//     //Function to construct the BST from its given level order traversal.
//    static class Pair{
//        Node par;
//        int min;
//        int max;
//        Pair(Node par,int min,int max){
//           this.par=par;
//           this.min=min;
//           this.max=max;
          
//        }
//    }
 
//     public Node constructBST(int[] arr)
//     {
//         //Write your code here
//         Queue<Pair> q=new ArrayDeque<>();
//         q.add(new Pair(null,Integer.MIN_VALUE,Integer.MAX_VALUE));
        
//         Node root=null;
//         int idx=0;
        
//         while(q.size()>0&&idx<arr.length){
//             Pair rem=q.remove();
            
//             if(arr[idx]<rem.min||arr[idx]>rem.max){
//                 continue;
//             }
//             Node node=new Node(arr[idx]);
//             idx++;
            
//             if(rem.par==null){
//                 root=node;
                
//             }
//             else{
                
//                 if(rem.par.data>node.data){
//                     rem.par.left=node;
//                 }else{
//                     rem.par.right=node;
//                 }
                
//             }
            
//         q.add(new Pair(node,rem.min,node.data-1));
//         q.add(new Pair(node,node.data+1,rem.max));
            
            
//         }
        
        
//         return root;
        

//     }