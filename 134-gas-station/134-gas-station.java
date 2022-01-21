class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int si=0;
        int tank=0;
        int remValue=0;
        
        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
            
            if(tank<0){
                si=i+1;
                remValue+=tank;
                tank=0;
            }
        }
        
        
        return remValue+tank>=0?si:-1;
    }
}