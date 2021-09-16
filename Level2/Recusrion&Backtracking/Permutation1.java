
import java.io.*;
import java.util.*;

public class Main {

  public static void Permutation1(int[] boxes, int ci, int ti){
    // write your code here
    if(ci>ti){
        for(int v:boxes){
            System.out.print(v);
        }
        System.out.println();
        return;
    }
    
    for(int i=0;i<boxes.length;i++){
        if(boxes[i]==0){
        boxes[i]=ci;
     permutations(boxes,ci+1,ti);
        boxes[i]=0;
    }
    }
    
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(new int[nboxes], 1, ritems);
  }

}