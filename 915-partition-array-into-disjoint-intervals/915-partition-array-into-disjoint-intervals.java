class Solution {
    public int partitionDisjoint(int[] arr) {
     
        
          int[] lmax=new int[arr.length];
        int[] rmin=new int[arr.length+1];
        
        rmin[arr.length]=Integer.MAX_VALUE;
        lmax[0]=arr[0];
        
        
        for(int i=1;i<arr.length;i++){
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        }
        
        for(int i=arr.length-1;i>=0;i--){
            rmin[i]=Math.min(rmin[i+1],arr[i]);
        }
        
        int idx=1;
        boolean isTrue=true;
        
        for(int i=0;i<arr.length;i++){

            if(lmax[i]<=rmin[i+1]&&isTrue){
                isTrue=false;
                idx=i+1;
            }
            
        }
                
        return idx;
    }
}