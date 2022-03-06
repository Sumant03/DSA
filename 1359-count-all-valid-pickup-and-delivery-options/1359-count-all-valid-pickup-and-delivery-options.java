class Solution {
  private int mod = (int) Math.pow(10,9) + 7;
    long[] dp = new long[501];
    public int countOrders(int n) {
        dp[1]=1L;
        dp[2]=6L;
        for (int i=3;i<=n;i++) {
            int spaceCount = (i-1)*2 + 1;
            long val = (spaceCount)*(spaceCount+1)/2;
            dp[i] = (dp[i-1]*val)%mod;
        }
        return (int) dp[n];
    }
}