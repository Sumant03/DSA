class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int pr=findPotentialRow(matrix,target);
        System.out.println(pr);
        if(pr==-1){
            return false;
        }
        
        return binarySearch(matrix,target,pr);
    }
    
    public static int findPotentialRow(int[][] matrix,int target){
        int lo=0;
        int hi=matrix.length-1;
        int c=matrix[0].length-1;
        while(lo<=hi){
            int m=(lo+hi)/2;
            
            if(matrix[m][0]<=target&&matrix[m][c]>=target){
                return m;
            }else if(matrix[m][0]<=target){
               lo=m+1;
            }else if(matrix[m][c]>=target){
                hi=m-1;
            }
        }
        return -1;
    }
    
    public static boolean binarySearch(int[][] matrix,int target,int row){
        int lo=0;
        int hi=matrix[0].length-1;
        
        while(lo<=hi){
            
            int mid=(lo+hi)/2;

            
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]>target){
                hi=mid-1;
            }else if(matrix[row][mid]<target){
                lo=mid+1;
            }
            
            
        }
        return false;
    }
}