class Solution {
   List<Integer> ans=new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
        
        for(int i=1;i<=9;i++){
            dfs(low,high,i,i+1);
        }      
            
        
        Collections.sort(ans);
        
        return ans;
        
    }
        
        
     public void dfs(int low,int high,int num,int i){
 
        if(num>high||i>10){
            return;
        }
        if(num>=low&&num<=high){
            ans.add(num);
        }

        dfs(low,high,num*10+i,i+1);


            }
        
}