// public class busRoute {
    
// }
// class Solution {
    
//     public static class Pair{
//         int bus_stop;
//         int lev;
//         Pair(){
            
//         }
//         Pair(int bus_stop,int lev){
//             this.bus_stop=bus_stop;
//             this.lev=lev;
            
//         }
            
//     }
    
//     public int numBusesToDestination(int[][] routes, int source, int target) {
     
//         HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        
//         for(int i=0;i<routes.length;i++){
//             for(int j=0;j<routes[i].length;j++){
//                 int bus_no=i;
//                 int bus_stop_no=routes[i][j];
                
//                 if(map.containsKey(bus_stop_no)==false){
//                     ArrayList<Integer> list =new ArrayList<>();
//                     list.add(bus_no);
//                     map.put(bus_stop_no,list);
//                 }else{
//                     ArrayList<Integer> list =map.get(bus_stop_no);
//                     list.add(bus_no);
//                     map.put(bus_stop_no,list);
//                 }
                
//             }
//         }
//     int val=bfs(routes,source,target,map);
//         return val;
        
//     }
    
//     public static int bfs(int[][] routes,int source,int dest,HashMap<Integer,ArrayList<Integer>>map ){
        
//         HashSet<Integer> bus_stop_vis=new HashSet<>();
//         HashSet<Integer> bus_vis=new HashSet<>();
        
//         ArrayDeque<Pair> q=new ArrayDeque<>();
        
//         q.add(new Pair(source,0));
//         bus_stop_vis.add(source);
        
//         while(q.size()>0){
//             //remove
//             Pair rem=q.remove();
            
//             if(rem.bus_stop==dest){
//                 return rem.lev;
//             }
            
            
            
//             ArrayList<Integer> buses=map.get(rem.bus_stop);
            
//             for(int bus :buses){
                
                
//                 if(bus_vis.contains(bus)==false){
//                     bus_vis.add(bus);
//                    int[] allStopIntBus=routes[bus];
                    
//                     for(int idx=0;idx<allStopIntBus.length;idx++){
//                         if(bus_stop_vis.contains(allStopIntBus[idx])==false){
//                             q.add(new Pair(allStopIntBus[idx],rem.lev+1));
//                             bus_stop_vis.add(allStopIntBus[idx]);
//                         }
//                     }
//                 }
                
//             }
            
             
//         }
        
//         return -1;
//     }
// }