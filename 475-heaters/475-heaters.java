class Solution {
    
    public static class Pair{
        int jl;
        int js;
        
        Pair(int jl,int js){
            this.jl=jl;
            this.js=js;
        }
        
    }
    public int findRadius(int[] houses, int[] heaters) {
        
        Arrays.sort(heaters);
        int count=0;
        
        for(int i=0;i<houses.length;i++){
            
            Pair p= helper(heaters,houses[i]);
            
            int ld=(p.js==-1)?Integer.MAX_VALUE:houses[i]-p.js;
            int rd=(p.jl==-1)?Integer.MAX_VALUE:p.jl-houses[i];
            
            int max=Math.min(ld,rd);
            
            count=Math.max(max,count);
        }
        
        return count;
    }
    
    public static Pair helper(int[] arr,int key){
  
        
        int lo=0;
        int hi=arr.length-1;
        
        int jl=-1;
        int js=-1;
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            
            if(arr[mid]==key){
                jl=js=arr[mid];
                break;
            }else if(arr[mid]<key){
                js=arr[mid];
                lo=mid+1;
            }else if(arr[mid]>key){
                jl=arr[mid];
                hi=mid-1;
            }
            
            
        }
        return new Pair(jl,js);
        
    }
}