class Solution {
    public int subarraySum(int[] arr, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>(); //prefix sum vs it's first occ
		
		int ps=0;
		int count=0;
	     map.put(0,1);
	 
		for(int i=0;i<arr.length;i++){
		    ps+=arr[i];
		 
		    if(map.containsKey(ps-k)==true){
            int val=map.get(ps-k);
            count+=val;
            
		    }
		    
		    if(map.containsKey(ps)==false){
		        map.put(ps,1);
		    }else{
		        map.put(ps,map.get(ps)+1);
		    }
		    
		}
		

		return count;
    }
}