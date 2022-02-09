class Solution {
    public int findPairs(int[] nums, int k) {
          Arrays.sort(nums);
        
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int j = i + 1;
            
            while (j < nums.length && (nums[j] - nums[i]) < k) {
                j++;
            }
            
            if (j < nums.length && (nums[j] - nums[i]) == k) result++;
        }
        
        return result;
    }
}