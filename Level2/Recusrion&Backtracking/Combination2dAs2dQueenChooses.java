import java.io.*;
import java.util.*;

public class Combination2dAs2dQueenChooses{

    public static void queensPermutations(int qpsf, int tq, int[][] chess){
        // write your code here
        
        if(qpsf==tq){
            for(int i=0;i<chess.length;i++){
                for(int j=0;j<chess[0].length;j++){
                    System.out.print(chess[i][j]!=0?"q"+chess[i][j]+"	":"-	");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        
        
        
        for(int row=0;row<chess.length;row++){
            for(int col=0;col<chess[0].length;col++){
            
            if(chess[row][col]==0){
                chess[row][col]=qpsf+1;
                queensPermutations(qpsf+1,tq,chess);
                chess[row][col]=0;
            }
        }
        }
    
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        
        queensPermutations(0, n, chess);
    }
}
