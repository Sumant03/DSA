class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int low = 1, k = 0;
        int high=getMax(piles);
        while (low <= high) {
            k = (low + high) / 2;
            int h = 0;
            for (int i = 0; i < piles.length; i ++) 
                h += Math.ceil(1.0 * piles[i] / k);
            if (h > H)
                low = k + 1;
            else
                high = k - 1;
        }
        return low;


    }
    
    public static int getMax(int[] arr){
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
}
