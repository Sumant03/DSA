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
class Solution {
    
    public int maxDepth(TreeNode root) {
    
        
        return helper(root,-1);
        // return depth;
    }
    int depth;
    
    public int helper(TreeNode node,int idx){
        if(node==null){
            return 0;         
        }
        
        
       int lf= helper(node.left,idx++);
       int rf= helper(node.right,idx++);
        
        
    
        return 1+Math.max(lf,rf);  
        
    }
    
}