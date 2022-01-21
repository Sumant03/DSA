class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int max=0;
        
        for(int[] val:trips){
            
            if(val[2]>max){
                max=val[2];
            }
        }
        
        
        int[] arr=new int[max+1];
        
        for(int[] val:trips){
            int si=val[1];
            int ei=val[2];
            int c=val[0];
            
            arr[si]+=c;
            arr[ei]-=c;
            
        }
        
        int ps=arr[0];
        
        for(int i=0;i<arr.length;i++){
             ps+=arr[i];
            
            if(ps>capacity){
                return false;
            }
        }
        return true;
        
    }
}