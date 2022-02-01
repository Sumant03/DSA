class Solution {
    public int maxProfit(int[] prices) {
      int bp=prices[0];
        int max=0;
        
        for(int price:prices){
         bp=Math.min(bp,price);
         max=Math.max(max,price-bp);   
            
        }
        
        return max;
        
    }
}