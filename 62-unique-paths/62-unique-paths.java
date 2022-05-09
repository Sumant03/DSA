class Solution {
    public int uniquePaths(int m, int n) {
      
        int N=m+n-2;
        int r=m-1;
        
        double val=1;
        
        for(int i=1;i<=r;i++){
            val=val*(N-r+i)/i;
        }
        
        return (int)val;
    }
   
}