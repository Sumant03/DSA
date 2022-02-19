class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                set.add(nums[i] * 2);
            } else {
                set.add(nums[i]);
            }
        }
        int ans = set.last() - set.first();
        while (!set.isEmpty() && set.last() % 2 == 0) {
            int highest = set.pollLast();
            set.add(highest / 2);
            ans = Math.min(ans, set.last() - set.first());
        }
        return ans;
    }
    }
