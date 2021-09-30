package Level2.Trees;

public class BstfromPostoderTraversl {
    
}
// package Level2.Trees;

// class  BstFromPreoderTraversal {
    

// static int idx;
   
// public static TreeNode bstFromPreorder(int[] postorder,int n) {
//      idx=n-1;
//    int min=Integer.MIN_VALUE;
//    int max=Integer.MAX_VALUE;
    
//     return helper(preorder,preorder[idx],min,max);
    
// }

// public static TreeNode helper(int[] preorder,int val,int min,int max){
//     if(idx>=preorder.length||!(val>=min&&val<=max)){
//         return null;
//     }
//  else{
//     TreeNode node=new TreeNode(preorder[idx]);
        
//         if(idx>0){
//      idx--;
//         }
      
//     node.right=helper(preorder,preorder[idx],node.val+1,max);    
//     node.left=helper(preorder,preorder[idx],min,node.val-1);

        
//     return node;

//     }
    
// }
// }