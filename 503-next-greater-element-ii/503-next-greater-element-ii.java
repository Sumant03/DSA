class Solution {
    public int[] nextGreaterElements(int[] arr) {
        
      int[] re=new int[arr.length];
      Stack<Integer> st=new Stack<>();
      st.push(arr[arr.length-1]);
      

      for(int i=arr.length-2;i>=0;i--){

          while(st.size()>0&&arr[i]>=st.peek()){
              st.pop();
          }
          st.push(arr[i]);
      }
                
       for(int i=arr.length-1;i>=0;i--){

          while(st.size()>0&&arr[i]>=st.peek()){
              st.pop();
          }

          if(st.size()==0){
              re[i]=-1;
          }else{
              re[i]=st.peek();
          }

          st.push(arr[i]);
      }         

      return re;
    }
}