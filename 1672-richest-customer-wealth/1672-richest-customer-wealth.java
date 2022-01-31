class Solution {
     public int sum(int[] arr){
        int sumVar = 0;
        for(int num : arr){
            sumVar += num;
        }
        return sumVar;
    }
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        int curSum = 0;
        for(int[] arr : accounts){
            curSum = sum(arr);
            if (curSum > maxSum){
                maxSum = curSum;
            }
        }
        return maxSum;
    }
}