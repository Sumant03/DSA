class Solution {
    Boolean[]  dp=new Boolean[1000000+1];
    
    public boolean winnerSquareGame(int n) {
        if(dp[n]!=null){
            return dp[n];
        }
        Boolean aliceWins=false;
        for(int i=1;i*i<=n;i++){
            
            if(n-i*i==0){
                aliceWins=true;
                break;
            }
            else{
              aliceWins=aliceWins||!winnerSquareGame(n-i*i);
            }
        }
        
        return dp[n]=aliceWins;
    }
}