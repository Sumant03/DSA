class Solution {
    public String removeKdigits(String num, int k) {
        
        
        Stack<Character> st=new Stack<>();
        
        
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            
            while(st.size()>0&&k>0&&st.peek()>ch){
                st.pop();
                
                k--;
            }
            st.push(num.charAt(i));
            
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        
        if(st.size()==0){
            return "0";
        }
        
        char[] arr=new char[st.size()];
        int idx=arr.length-1;
        String str="";
        
        while(st.size()>0){
            arr[idx]=st.pop();
            idx--;
        }

        StringBuilder sb=new StringBuilder("");
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