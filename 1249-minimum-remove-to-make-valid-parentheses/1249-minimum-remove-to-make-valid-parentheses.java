class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> st=new Stack<>();
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                
                if(st.size()>0&&s.charAt(st.peek())=='('){
                    st.pop();
                }else {
                    st.push(i);
                }
                
            }else if(ch=='('){
                
                st.push(i);
            }
            
        }
        char[] arr=s.toCharArray();
        
  
        
          while(st.size()>0){
            int idx=st.peek();
            str=str.deleteCharAt(idx);
            st.pop();
        }
        return str.toString();
    }
}