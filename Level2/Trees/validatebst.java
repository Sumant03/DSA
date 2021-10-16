// package Level2.Trees;

// public class validatebst {
    
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
//     static TreeNode prev;
//     public boolean isValidBST(TreeNode root) {
//         prev=null;
        
//         boolean val=helper(root);
        
//         return val;
//     }
    
    
//     public static boolean helper(TreeNode root){
//         if(root ==null){
//             return true;
//         }
        
        
//         boolean lans=helper(root.left);
        
//         //work and update
//         if(prev!=null&&prev.val>=root.val){
//             return false;
//         }
//         prev=root;
        
//         boolean rans=helper(root.right);
        
//         return lans&&rans;
        
        
        
        
//     }
// }