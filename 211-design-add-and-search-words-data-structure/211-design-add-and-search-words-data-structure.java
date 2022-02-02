class WordDictionary {

    static class Node{
        Node[] child;
        boolean isEnd;
        
        Node(){
            child=new Node[26];
        }
    }
    Node root;
    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
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
    
    public boolean search(String word) {
        return helper(root,word,0);
    }
    public boolean helper(Node curr,String word,int idx){
        if(idx==word.length()){
            return curr.isEnd;
        }
        
        char ch=word.charAt(idx);
        
        if(ch=='.'){
          for(int i=0;i<26;i++){
            if(curr.child[i]!=null&&helper(curr.child[i],word,idx+1)==true){
                return true;
            }  
          }    
        }
        else{
            if(curr.child[ch-'a']!=null){
                return helper(curr.child[ch-'a'],word,idx+1);
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */