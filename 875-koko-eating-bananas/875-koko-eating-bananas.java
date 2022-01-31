class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max=piles[0];
        
        for(int i=1;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        
        if(h==piles.length){
            return max;
        }
        
        int lo=0,hi=max;
        int ans=0;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(isPossible(piles,mid,h)==true){
                //mid jitni speed rkhte huye kya me 
                //piles ke saare banana ko h hours mein khaaa skte hu 
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        
        }
    return ans;
    }
    
    public static boolean isPossible(int[] piles,int mid,int h){
        int t=0;
        
        for(int val:piles){
            
            t+=Math.ceil(1.0*val/mid);
            
            
        }
    return t<=h;
    }
}
