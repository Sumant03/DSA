class Solution {
    public class Pair{
        int id;
        int st;
        int wt;
        
        Pair(){
            
        }
        
        Pair(int id,int st,int wt){
            this.id=id;
            this.st=st;
            this.wt=wt;
        }
    }
    
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans=new int[n];
        Stack<Pair> st=new Stack<>();
        
        for(String log:logs){
            String[] arr=log.split(":");
            
            int id=Integer.parseInt(arr[0]);
            String action=arr[1];
            int t=Integer.parseInt(arr[2]);
            
            if(action.equals("start")){
                st.push(new Pair(id,t,0));
            }else{
                int tts=t-st.peek().st+1;
                int et=tts-st.peek().wt;
                ans[st.peek().id]+=et;
                st.pop();
                
                if(st.size()>0){
                         //parent exists
                    st.peek().wt+=tts;
                }
                
            }
            
        }
        
        return ans;
       
    }
}