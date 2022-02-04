class Solution {
    
    static class Node{
        Node[] child;
        boolean isEnd;
        
        Node(){
            child=new Node[26];
        }
    }
    Node root;
    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            
            char ch=word.charAt(i);
            if(curr.child[ch-'a']==null){
                curr.child[ch-'a']=new Node();
            }
            curr=curr.child[ch-'a'];
        }
        curr.isEnd=true;
    }
    
    
    public String longestWord(String[] words) {
        root=new Node();
        ans="";
        
        for(String str:words){
            insert(str);
        }
        dfs(root,"");
        return ans;
    }
    static String ans;
    public void dfs(Node curr,String psf){
        if(psf.length()>ans.length()){
            ans=psf;
        }
        
        for(int i=0;i<26;i++){
            Node child=curr.child[i];
            
            if(child!=null){
                if(child.isEnd==false){
                    continue;
                }else{
                    dfs(child,psf+(char)(i+'a'));
                }
                
            }
        }
    }
        
    
}