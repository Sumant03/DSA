class Solution {
    public int largestRectangleArea(int[] arr) {
     if (arr == null ||arr.length == 0) {
            return 0;
        }
        
    int n=arr.length;    
    int[] rb=new int[n];
    Stack<Integer> st=new Stack<>();
    st.push(n-1);
    rb[n-1]=n;
    
    for(int i=n-2;i>=0;i--){
        
        while(st.size()>0&&arr[i]<=arr[st.peek()]){
            st.pop();
        }
        
        
        if(st.size()==0){
            rb[i]=n;
        }else{
            rb[i]=st.peek();
        }
        st.push(i);
    }
        
    st=new Stack<>();
    st.push(0);
    int[] lb=new int[n];    
    lb[0]=-1;
        
    for(int i=1;i<n;i++){
        while(st.size()>0&&arr[i]<=arr[st.peek()]){
            st.pop();
        }
        
        if(st.size()==0){
            lb[i]=-1;
        }else{
            lb[i]=st.peek();
        }
        
        st.push(i);
    }    
        int max=0;
        
    for(int idx=0;idx<n;idx++){
        int w=rb[idx]-lb[idx]-1;
        int h=arr[idx];
        
        int ar=h*w;
        
        if(ar>max){
            max=ar;
        }
        
    }    
       return max; 
    }
}