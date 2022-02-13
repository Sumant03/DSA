class Solution {
      List<List<Integer>> output = new ArrayList<>();
    int n,k;
    
    public List<List<Integer>> subsets(int[] nums) {
       n= nums.length;
       for(k=0;k<n+1;++k){
            backtrack(0,new ArrayList<Integer>(),nums);
       }
       return output;
    }
    
    public void backtrack(int first , ArrayList<Integer> curr,int [] nums){
          if(curr.size()==k){
              output.add(new ArrayList(curr));
              return;
          }
          for(int i=first;i<n;++i){
               curr.add(nums[i]);
               //Using further integers in the array to complete the combination
               backtrack(i+1,curr,nums);
               //Backtracking by removing the last element
               curr.remove(curr.size()-1);
          }
    }
}