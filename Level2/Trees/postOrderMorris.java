// package Level2.Trees;

// public class postOrderMorris {
    
// }
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
        
//         List<Integer> ans=morrisInTraversal(root);
//         Collections.reverse(ans);
//         return ans;
        
        
//     }
    
//      public static TreeNode leftMostNode(TreeNode lc,TreeNode curr){
//       TreeNode lmn=lc;
//       while(lmn.left!=null&&lmn.left!=curr){
//           lmn=lmn.left;
//       }
      
//       return lmn;
//   }

//   public static ArrayList<Integer> morrisInTraversal(TreeNode node) {
//     ArrayList<Integer> ans=new ArrayList<>();
    
//     TreeNode curr=node;
    
//     while(curr!=null){
        
//         TreeNode lc=curr.right;
//         if(lc==null){
//             ans.add(curr.val);
//             curr=curr.left;
//         }else{
//             TreeNode rmn=leftMostNode(lc,curr);
//             if(rmn.left==null){
//                 //right child is not visited 
                
//                   ans.add(curr.val); //work
//                 rmn.left=curr;
//                 curr=curr.right; //left
//             }else {
                
              
//                 rmn.left=null;
//                 curr=curr.left;  //right
//             }
//         }
        
//     }
//     return ans;
//   }
// }