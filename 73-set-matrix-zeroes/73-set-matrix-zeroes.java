class Solution {
    public void setZeroes(int[][] matrix) {
       
        int row=matrix.length, col=matrix[0].length;
        
        int[] d1=new int[row];
        int[] d2=new int[col];
        
        Arrays.fill(d1,-1);
        Arrays.fill(d2,-1);
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                
                if(matrix[i][j]==0){
                    d1[i]=0;
                    d2[j]=0;
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                
                if(d1[i]==0||d2[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}