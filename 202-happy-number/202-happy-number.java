class Solution {
    public boolean isHappy(int n) {
        int res=n;
        
        while(res!=1&&res!=4){
            
            res=getSum(n);
            n=res;
        }
        if(res==1){
            return true;
        }else{
            return false;
        }
        
        
    }
    
    public static int getSum(int n){
        int sum=0;
        
        while(n!=0){
            int val=n%10;
            sum+=val*val;
            n=n/10;
        }
        return sum;
    }
}