class Solution {
    public void wiggleSort(int[] nums) {
        
        Arrays.sort(nums);
        
        int i=1;
        int k=nums.length-1;
        
        int[] arr=new int[nums.length];
        
        while(i<nums.length){
            arr[i]=nums[k];
            i+=2;
            k--;
        }
        
        
        
        
        i=0;
        
        
          while(i<nums.length){
            arr[i]=nums[k];
            i+=2;
            k--;
        }
        
        for(int idx=0;idx<nums.length;idx++){
            nums[idx]=arr[idx];
        }
     
        
    }
}