class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int mp=prices[0];
        
        for(int price:prices){
            mp=Math.min(mp,price);
            max=Math.max(max,price-mp);
            
        }
        return max;
    }
}