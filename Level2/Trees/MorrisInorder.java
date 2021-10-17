package Level2.Trees;



import Level2.Trees.PreOrderMorris.TreeNode;

public class MorrisInorder {
static TreeNode prev;
static TreeNode fn;
static TreeNode sn;
    
    public static TreeNode rightMostNode(TreeNode lc,TreeNode curr){
     TreeNode rmn=lc;

     while(rmn.right!=null&&rmn.right!=curr){
         rmn=rmn.right;
     }
       return rmn;
    }

    public void recoverTree(TreeNode node){
           prev=fn=sn=null;
    TreeNode curr=node;

    while(curr!=null){
       TreeNode lc=curr.left;


       if(lc==null){
           if(prev!=null&&prev.val>=node.val){
              if(sn==null){
                  fn=prev;
              }
              sn=node;
           }
           prev=curr;
           curr=curr.right;
       }else{
           TreeNode rmn=rightMostNode(lc,curr);

           if(rmn.right==null){
              rmn.right=curr;
              curr=curr.left;
           }else{
            if(prev!=null&&prev.val>=node.val){
                if(sn==null){
                    fn=prev;
                }
                sn=node;
             }
             prev=curr;
            rmn.right=null;
            curr=curr.right;
           }
       }
    }

    int temp=fn.val;
    fn.val=sn.val;
    sn.val=temp;
   } 



}
