class Solution {
    public List<List<Integer>> generate(int rows) {
      List<List<Integer>> ans=new ArrayList<>();
      List<Integer> row; 
        
    for(int i=0;i<rows;i++){
           int val=1;
           row=new ArrayList<>(); 
       for(int j=0;j<=i;j++){
            row.add(val);
           val=val*(i-j)/(j+1);    
        }
            ans.add(row);
   
        }
        
            return ans;
        
    }
}