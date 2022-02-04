class StreamChecker {
    StringBuilder sb;
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
        for(int i=word.length()-1;i>=0;i--){
            
            char ch=word.charAt(i);
            if(curr.child[ch-'a']==null){
                curr.child[ch-'a']=new Node();
            }
            curr=curr.child[ch-'a'];
        }
        curr.isEnd=true;
    }
    
    public StreamChecker(String[] words) {
        sb=new StringBuilder("");
        root=new Node();
        
        for(String word:words){
            insert(word);
        }
    }

    public boolean query(char letter) {
       Node curr=root;
        
        sb.append(letter);
        for(int i=sb.length()-1;i>=0;i--){
             char ch=sb.charAt(i);
            Node child=curr.child[ch-'a'];

                if(child==null){
                    return false;
                }
                else if(child.isEnd==true){
                    return true;
                }
                curr=child;

            }
        
        return false;

    }
    
}


/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */