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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        
       
        inOrder(l1,root1);
        inOrder(l2,root2);
        
       List<Integer> ans= merge(l1,l2);
        return ans;
    }
    public static List<Integer> merge(ArrayList<Integer> l1,ArrayList<Integer> l2){
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        
        while(i<l1.size()&&j<l2.size()){
            
            if(l1.get(i)<l2.get(j)){
                ans.add(l1.get(i));
                i++;
            }else if(l1.get(i)>l2.get(j)){
                ans.add(l2.get(j));
                    j++;
            }else{
                ans.add(l2.get(j));
                j++;
                
            }
            
        }
        
        while(i<l1.size()){
            ans.add(l1.get(i));
            i++;
        }
        while(j<l2.size()){
            ans.add(l2.get(j));
            j++;
        }
        
        return ans;
    }
    public static void inOrder(ArrayList<Integer> l,TreeNode root){
        
        if(root!=null){
            
            inOrder(l,root.left);
            l.add(root.val);
            inOrder(l,root.right);
        }
        
    }
    
}