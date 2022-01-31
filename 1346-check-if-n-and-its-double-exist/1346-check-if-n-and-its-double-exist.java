class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> ans =new HashMap<>();
                
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];

    if(ans.containsKey(val*2)||(val%2==0&&ans.containsKey(val/2))){
                return true;
            }
            ans.put(val,1);
        }
         
        
        return false;
        

        
    }
}