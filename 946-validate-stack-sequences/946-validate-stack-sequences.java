class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        int count=0;
        
        Stack<Integer> st=new Stack<>();
    
        int j=0;
        int i=0;
        while(j<pushed.length){
              if(st.size()>0&&popped[j]==st.peek()){

                st.pop();
                       count++;
                      j++;
                  }
            else if(i<pushed.length){
                  st.push(pushed[i]);
                  i++;
              }else{
                return false;
            }
            }
        
        
            return count==pushed.length;
        
    }
}