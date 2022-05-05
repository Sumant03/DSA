class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length<=1){
            return;
        }
        
        int idx=-1;
        
        for(int i=nums.length-2;i>=0;i--){
            
            if(nums[i]<nums[i+1]){
                idx=i;
                 System.out.println(idx);
                break;
                
            }
           
        }
        
        if(idx>=0){
                int k=nums.length-1;  
            for(int i=nums.length-1;i>=0;i--){
        
                if(nums[idx]<nums[i]){
                    k=i;
                      System.out.println(k);
                    break;
                }
               
        }
        
            swap(nums,k,idx);
        }
        
        if(idx<0){
            reverse(nums,0,nums.length-1);
        }else{
        
        reverse(nums,idx+1,nums.length-1);
        }
        
    }
    
    public void swap(int[] arr,int k,int idx){
        int temp=arr[k];
        arr[k]=arr[idx];
        arr[idx]=temp;
        
    }
    
    public void reverse(int[] arr,int i,int j){
        
        while(i<=j){
           swap(arr,i++,j--);
        }
        
    }
}