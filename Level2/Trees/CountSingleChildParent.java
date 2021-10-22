package Level2.Trees;

public class int  CountSingleChildParent {
 
    if(node==null){
        return 0;
    }
    

    int lc=CountSingleChildParent(node.left);
    int rc=CountSingleChildParent(node.right);

    if((node.left!=null&&node.right==null)||(node.left==null&&node.right!=null)){
        ans++;
    }
      return ans;


}


