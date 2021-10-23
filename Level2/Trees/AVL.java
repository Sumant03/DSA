package Level2.Trees;
import java.util.*;
public class AVL {
 
    public static class Node {
        int data;
        Node left;
        Ndoe right;

        Node(){

        }
        Node(int data){
            this.data=data;
        }
    }

    public static updateheightAndbalance(Node node){
     if(node==null){
         return;
     }    


    }


    public static Node add(Node node,int data){
        if(node==null){
            return new Node(data);
        }
        
        if(node.data<data){
            node.right=add(node.right,data);
        }else if(node.data>data){
            node.left=add(node.left,data);
        }
        else{

        }


        updateheightAndbalance(node);
        checkAndSolve(node);

        return node;
    }

    public static Node delete(Node node,int data){
        if(node.data<data){
            node.right=delete(node..right,data);
        }else if(node.data>data){
            node.left=delete(node.left, data)
        }else{
            if(node.left!=null&&node.right!=null){
              int lmax=max(node.left);
              node.data=lmax;
              node.left=delete(node.left,lmax);
            }   
            else if(node.left!=null){
                return node.left;
            }else if(node.right!=null){
                return node.right;
            }else{
                return null;
            }        
        }

    }
    public static int max(Node node){
        if(node.right!=null){
       
        }
    }
    public static Node solveLL(Node node){
        Node lc=node.left; //left child of node
        Node temp=lc.right; //right child of lc
        lc.right=node;
        node.left=temp;
        return lc;
    }
    public static Node solveRR(Node node){
     //we have to do left rotation at node's right child
     Node rc=node.right; //right child
     Node temp=rc.left; //left child of rc
     rc.left=node; 
     node.right=temp;
     return rc;
    }

public static void checkAndSolve(Node node){
    if(node.bf>1||node.bf<-1){
       
        //problem is detected , identrify the problem correctly 
        if(node.bf>0){
            if(node.left.bf>0){
                 //LL
             return solveLL(node)
            }else{
                //LR
               node.right=solveRR(node)
               return solveLL(node.right);
            }
        }
        else{
            if(node.right.bf>0){
                //RL
            }else{
                //RR
             return solveRR(node)
            }
        }
  

    }else{
        return;
    }
}




    
    public static void main(String args[]){
        Node root=null;
        int arr[]={10}
        display(root);
    }


}
