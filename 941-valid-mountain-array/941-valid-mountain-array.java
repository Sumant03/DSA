class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int idx1=0;
        int idx2=0;
        int i=1;
    while(i<arr.length&&i+1<arr.length&&arr[i]>arr[i-1]){
             idx1++;
             i++;
       }
        System.out.println(arr[idx1]);
        
        
        int j=arr.length-2;
        while(j>=0&&arr[j]>arr[j+1]){
            idx2++;
            j--;
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