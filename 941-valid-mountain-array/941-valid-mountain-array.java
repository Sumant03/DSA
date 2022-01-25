class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int idx1=0;
        int idx2=0;
        for(int i=1;i<arr.length;i++){
         

            
            if(arr[i]>arr[i-1]){
                idx1++;
            }else{
                break;
            }
        }
        System.out.println(arr[idx1]);

        for(int i=arr.length-2;i>=0;i--){



            
            if(arr[i]>arr[i+1]){
                idx2++;
            }else{
                break;
            }
        }
        System.out.println(arr[idx2]);
        
        if(idx1>0&&idx2>0&&(idx1+idx2+1)==arr.length){
            return true;
        }
        else{
            System.out.println("3");
            return false;
        }
        
    }
}