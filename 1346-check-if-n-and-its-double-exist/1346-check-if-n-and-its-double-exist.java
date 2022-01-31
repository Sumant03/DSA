class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> ans =new HashMap<>();
                
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
        
            int fr=ans.getOrDefault(val,0)+1;
            ans.put(val,fr);
        }
         
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
            
            if(val==0&&ans.get(val)>1){
                return true;
            }
            
            if(val!=0&&ans.containsKey(val*2)){
                return true;
            }
            
        }
        return false;
        

        
    }
}