import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    HashMap<String,String> map=new HashMap<>();
    
    while(n-->0){
        
        int emp=scn.nextInt();
        int man=scn.nextInt();
        
        map.put(emp,man);
    }
    
    HashMap<String,ArrayList<String>> gt=new HashMap<>();
    String ceo="";
    for(String emp:map.keySet()){
        String man=map.get(emp);
        
        
        if(emp.equals(man)==true){
            ceo=emp;
            ArrayList<String> list=gt.getOrDefault(man,new ArrayList<>());
            gt.put(emp,list);
            continue;
            
        }       
        
        if(gt.containsKey(emp)==false){
            gt.put(emp,new ArrayList<String>)
        }
        
    ArrayList<String> list=
        
        
    }
    
    
  }

}