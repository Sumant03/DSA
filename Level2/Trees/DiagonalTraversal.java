// package Level2.Trees;

// public class DiagonalTraversal {
    
// }
// /**
//  * Definition for binary tree
//  * class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) {
//  *      val = x;
//  *      left=null;
//  *      right=null;
//  *     }
//  * }
//  */
// public class Solution {
//     public static class  Pair{
//         int d;
//         TreeNode node;
//         Pair(int d,TreeNode node){
//           this.d=d;
//           this.node=node;
//         }
//     }

//     public ArrayList<Integer> solve(TreeNode A) {
         
//          ArrayList<ArrayList<Integer>> list =new ArrayList<>();
         
//          ArrayDeque<Pair> q=new ArrayDeque<>();
//          q.add(new Pair(0,A));
//          while(q.size()>0){
//           Pair rem=q.remove();
//           TreeNode node=rem.node;
//            int d=rem.d;

//            if(d==list.size()){
//              ArrayList<Integer> ans=new ArrayList<>();
//              ans.add(node.val);
//              list.add(ans);
//            }else{
//              list.get(d).add(node.val);
//            }

//            if(node.left!=null){
//              q.add(new Pair(d+1,node.left));
//            }
//            if(node.right!=null){
//              q.add(new Pair(d,node.right));
//            }

//          }

//          ArrayList<Integer> get=new ArrayList<>();
//           for(int i=0;i<list.size();i++){
//                 List<Integer> middle= list.get(i);
           
//               for(int j=0;j<middle.size();j++){
//                   get.add(middle.get(j));
//               }
//           }
//      return get;

    
//     }
// }