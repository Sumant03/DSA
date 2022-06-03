class Solution {
    public void setZeroes(int[][] matrix) {
        
    int[] r=new int[matrix.length];
    int[] c=new int[matrix[0].length];
        
    Arrays.fill(r,-1);
    Arrays.fill(c,-1);
        
    int row=matrix.length;
    int col=matrix[0].length;
        
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            
            if(matrix[i][j]==0){
                r[i]=0;
                c[j]=0;
            }
        }
    }
        
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            
            if(r[i]==0||c[j]==0){
                matrix[i][j]=0;
            }
        }
    }
        
        
        
    }
}