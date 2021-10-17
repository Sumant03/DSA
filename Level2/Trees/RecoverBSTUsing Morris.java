// package Level2.Trees;

// public class RecoverBSTUsing Morris {
    
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
//     static TreeNode fn;
//     static TreeNode sn;
        
//         public static TreeNode rightMostNode(TreeNode lc,TreeNode curr){
//          TreeNode rmn=lc;
    
//          while(rmn.right!=null&&rmn.right!=curr){
//              rmn=rmn.right;
//          }
//            return rmn;
//         }
    
//         public void recoverTree(TreeNode root){
//                prev=fn=sn=null;
//         TreeNode curr=root;
    
//         while(curr!=null){
//            TreeNode lc=curr.left;
    
    
//            if(lc==null){
//                if(prev!=null&&prev.val>=curr.val){
//                   if(fn==null){
//                       fn=prev;
//                   }
//                   sn=curr;
//                }
//                prev=curr;
//                curr=curr.right;
//            }else{
//                TreeNode rmn=rightMostNode(lc,curr);
    
//                if(rmn.right==null){
//                   rmn.right=curr;
//                   curr=curr.left;
//                }else{
//                 if(prev.val>=curr.val){
//                     if(fn==null){
//                         fn=prev;
//                     }
//                     sn=curr;
//                  }
//                  prev=curr;
                   
//                 rmn.right=null;
//                 curr=curr.right;
//                }
//            }
//         }
    
//         int temp=fn.val;
//         fn.val=sn.val;
//         sn.val=temp;
//        } 
    
    
    
    
    
        
//     }