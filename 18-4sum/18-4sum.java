class Solution {
    
     public List<List<Integer>> fourSum(int[] nums, int target) {
      
         List<List<Integer>> ans=new ArrayList<>();
      
         Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
             if(i!=0&&nums[i]==nums[i-1]){
                 continue;
             }

         List<List<Integer>> res=threeSum(i+1,nums,target-nums[i]);

         for(List<Integer> list:res){
             list.add(nums[i]);
             ans.add(list);
           }


      }
       return ans;
        
        
    }
    
     public static List<List<Integer>> threeSum(int si,int[] nums, int target) {
    // write your code here
             List<List<Integer>> ans=new ArrayList<>();

             int n=nums.length;

              for(int i=si;i<n-2;i++){
                 if(i!=si&&nums[i]==nums[i-1]){
                     continue;
                 }

             List<List<Integer>> res=twoSum(i+1,nums,target-nums[i]);

             for(List<Integer> list:res){
                 list.add(nums[i]);
                 ans.add(list);
             }


            }
                 return ans;
     }

     public static List<List<Integer>> twoSum(int si, int[] arr, int target) {
    // write your code here
        List<List<Integer>> ans=new ArrayList<>();

        int i=si;
        int j=arr.length-1;

        while(j>i){
            if(i!=si&&arr[i]==arr[i-1])
            {
                i++;
                continue;
            }        
            if(arr[i]+arr[j]==target){
                List<Integer> res=new ArrayList<>();
                res.add(arr[i]);
                res.add(arr[j]);
                ans.add(res);
                i++;
                j--;
            }else if(arr[i]+arr[j]<target){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
    
}