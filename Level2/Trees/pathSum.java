package Level2.Trees;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class pathSum {
    
//     public static  boolean hasPathSum(TreeNode node, int data) {
//           if(node==null){
//            return false;
//        }
         
         
//          if(node.left==null&&node.right==null&&data-node.val==0){
             
//                  return true;
             
//          }else{
//              return hasPathSum(node.left,data-node.val)||hasPathSum(node.right,data-node.val);
//          }
// }
// public static void main(String args[]){
// System.out.println(hasPathSum(node,23));
// }
// }