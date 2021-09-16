
import java.io.*;
import java.util.*;

public class Main {

    public static void Combination2DTO1D(int qpsf, int tq, boolean[][] chess, int lcno) {
        // write your code here
        
        
    
        
        if(qpsf==tq){
            for(int row=0;row<chess.length;row++ ){
                for(int col=0;col<chess[0].length;col++){
                    if(chess[row][col]==true){
                        System.out.print("q\t");
                    }else{
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            
            System.out.println();
            return;
        }
        
        
        for(int cell=lcno+1;cell<tq*tq;cell++){
                int row=cell/chess[0].length;
        int col=cell%chess[0].length;
            
            
          
                chess[row][col]=true;
                
queensCombinations(qpsf+1,tq,chess,cell);
                chess[row][col]=false;
            
            
        }
        
        
        
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, -1);
    }
}