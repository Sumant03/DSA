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
    
//     public static class Pair{
//         int r2n;
//         int n2n;
//         Pair(){
            
//         }
//         Pair(int r2n,int n2n){
//             this.r2n=r2n;
//             this.n2n=n2n;
//         }
//     }
//     public int maxPathSum(TreeNode root) {
//         Pair ans=helper(root);
//         return ans.n2n;
//     }
//     public static int max(int ...a){
//         int max=a[0];
        
//         for(int i=1;i<a.length;i++){
//             if(max<a[i]){
//                 max=a[i];
//             }
//         }
//         return max;
        
//     }
    
//     public static Pair helper(TreeNode node){
//         if(node==null){
//             return new Pair(Integer.MIN_VALUE,Integer.MIN_VALUE);
//         }
//         else if(node.left==null&&node.right==null){
//             return new Pair(node.val,node.val);
//         }
        
//         Pair lp=helper(node.left);
//         Pair rp=helper(node.right);
        
//         int nc=Integer.MIN_VALUE;
        
//         if(node.left!=null&&node.right!=null){
//             nc=lp.r2n+node.val+rp.r2n;
//         }
        
//         int r2n=max(max(lp.r2n,rp.r2n)+node.val,node.val);
//         int n2n=max(r2n,lp.n2n,rp.n2n,nc);
        
//         return new Pair(r2n,n2n);
        
//     }
// }package Level2.Trees;

// public class MaxPathSum {
    
// }
