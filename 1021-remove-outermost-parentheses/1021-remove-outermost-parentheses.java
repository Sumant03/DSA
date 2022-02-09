class Solution {
    public String removeOuterParentheses(String s) {
      
         Stack<Character> st=new Stack<>();
         String str="";
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            
            if(ch==')'){
                st.pop();
                if(st.size()!=0){
                   
                    str+=')';
                }
                
            }else{
            
                if(st.size()!=0){
                    str+='(';
                }
                 st.push(ch);    
            }
            i++;
        }
        
        return str;
    }
}