class Solution {
    public boolean canPlaceFlowers(int[] arr, int num) {
       int n=arr.length;
        if(n==0||(n==1&&arr[0]==0)){
           return true;
       } 
        
      int  count=0;
        if(arr[0]==0&&arr[1]==0){
            count++;
              arr[0]=1;
        }
        
        for(int i=1;i<arr.length;i++){
            
            if(i+1<arr.length){
                if(arr[i-1]==0&&arr[i+1]==0&&arr[i]==0){
                    arr[i]=1;
                    count++;
                }
            }else{
                if(arr[i-1]==0&&arr[i]==0){
                    arr[i]=1;
                    count++;
                }
            }
            
            
        }
           
           if(count>=num){
               System.out.println(count);
               return true;
           }else{
               return false;
           }
        
    }
}