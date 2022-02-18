class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            
            while(st.size()>0&&k>0&&st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.size()==0){
            return "0";
        }
        
        
        char[] arr=new char[st.size()];
        StringBuffer sb=new StringBuffer("");
        int idx=arr.length-1;
        
        while(st.size()>0){
            char val=st.pop();
            arr[idx]=val;
            idx--;
        }
        
        int fnz=arr.length-1;
        
        for(int i=0;i<arr.length;i++){
            
            sb.append(arr[i]);
            if(fnz==arr.length-1&&arr[i]!='0'){
                fnz=i;
            }
        }
        
        return sb.toString().substring(fnz);
    }
}