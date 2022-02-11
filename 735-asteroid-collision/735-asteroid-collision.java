class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      
        Stack<Integer> st=new Stack<>();
        Boolean isAdded=false;
        
        for(int i=0;i<asteroids.length;i++){
            
            int val=asteroids[i];
              
            if(st.size()>0&&st.peek()>0&&val<0){
                while(st.size()>0&&st.peek()>0&&st.peek()<-val){
                    st.pop();
                }
                if(st.size()>0&&st.peek()==-val){
                    st.pop();
                }
                 else if(st.size()>0&&st.peek()>-val){
                    continue;
                }else {
                    st.push(val);
                }
            }else{
                st.push(val);
            }            
//             if(st.size()>0)&&(val<0&&st.peek()>0)){
//             while((st.size()>0)&&(val<0&&st.peek()>0)){
                
//                 if(Math.abs(val)>Math.abs(st.peek())){
//                     st.pop();
//                     st.push(val);
//                     val=st.peek();
//                     isAdded=true;
//                 }else if(Math.abs(val)==Math.abs(st.peek()){
                    
//                 }
//             }
//             }
            
//             if(isAdded==false){
//                 st.push(val);
//             }else{
//                 isAdded=false;
//             }
              
            
        }
        
        int[] arr=new int[st.size()];
        int idx=arr.length-1;
        while(st.size()>0){
            arr[idx]=st.peek();
            st.pop();
            idx--;
        }
        
        return arr;
    }
}