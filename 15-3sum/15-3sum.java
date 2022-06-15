class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
        
//         Arrays.sort(nums);
        
//         List<List<Integer>> ans=new ArrayList<>();
        
//         for(int i=0;i<nums.length-2;i++){
            
//             if(i==0||(i>0&&nums[i]!=nums[i-1])){
//             int lo=i+1,hi=nums.length-1,sum=0-nums[i];
            
//             while(lo<hi){
                
//                 if(nums[lo]+nums[hi]==sum){
//                     List<Integer> mans=new ArrayList<>();
//                     mans.add(nums[i]);
//                     mans.add(nums[lo]);
//                     mans.add(nums[hi]);
                    
//                     ans.add(mans);
                    
//                     while(lo<hi&&nums[lo]==nums[lo+1]) lo++;
//                     while(lo<hi&&nums[hi]==nums[hi-1]) hi--;
                    
//                     lo++;
//                     hi--;
//                 }
//                 else if(nums[lo]+nums[hi]>sum){
//                    hi--;
//                 }
//                 else{
//                     lo++;
//                 }
                
                
//             }
                
//             }     
            
//         }
        
//         return ans;
//     }
    
    public static List < List < Integer >> tsUniquePairs(int[] nums, int si, int target) {
        int i = si;
        int j = nums.length - 1;

        List < List < Integer >> ans = new ArrayList < > ();


        while (i < j) {
            if (i != si && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            if (nums[i] + nums[j] == target) {
                ArrayList < Integer > res = new ArrayList < > ();
                res.add(nums[i]);
                res.add(nums[j]);
                ans.add(res);

                i++;
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }

        return ans;
    }

    public static List < List < Integer >> threeSum(int[] nums) {

         int target=0;
        Arrays.sort(nums);
        List < List < Integer >> ans = new ArrayList < > ();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            List < List < Integer >> res = tsUniquePairs(nums, i + 1, target - nums[i]);

            for (List < Integer > list: res) {
                list.add(nums[i]);
                ans.add(list);
            }
        }

        return ans;
    }
}