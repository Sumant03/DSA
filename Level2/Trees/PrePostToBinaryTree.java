// class Solution {
//     public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
//         int n=preorder.length;
        
//           return  helper(preorder ,0,n-1,postorder,0,n-1);      
//     }
    
//     public static TreeNode helper (int[] preorder,int prs,int pre,int[] postorder,int pos,int poe){
//         if(pos>poe){
//             return null;
//         }
//         if(prs==pre){
//             return new TreeNode(preorder[prs]);
//         }
        
        
//         TreeNode node=new TreeNode(preorder[prs+1]);
//         int idx=-1;
//         int val=preorder[prs+1];
        
//         for(int i=prs;i<=pre;i++){
//             if(postorder[i]==val){
//                 idx=i;
//                 break;
//             }
//         }
//         int cls=idx-pos+1;
        
//         node.left=helper(preorder,prs,prs+cls,postorder,pos,idx);
//         node.right=helper(preorder,prs+cls,pre,postorder,idx+1,poe-1);
        
//         return node;
        
//     }
    
// }