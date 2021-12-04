import java.util.*;
public class RabbitsInAForest {
    public int numRabbits(int[] answers) {
        
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        
        for(int i=0;i<answers.length;i++){
            int of=map.getOrDefault(answers[i],0);
            map.put(answers[i],of+1);
        }
        
        
        for(int key:map.keySet()){
            int val=map.get(key);
            int gs=key+1;
            count+=Math.ceil((val*1.0)/gs)*gs;
        }
        
        return count;
        
        
        
    }
}