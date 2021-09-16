

// import java.io.*;
// import java.util.*;

// public class NQueensBranchAndBound{

//   public static void main(String[] args) throws Exception {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int[][] board = new int[n][n];
//     //write your code here
    
//     nQueens(board,"",0,new int[n],new int[2*n-1],new int[2*n-1]);
//   }
  
//   public static void  nQueens(int[][] chess,String qsf,int row,int[] bup,int[] bld,int[] brd){
//        if(row==chess.length){
//          System.out.println(qsf+".");
//      }
     
//    for(int col=0;col<chess.length;col++){
//        if(isSafe(chess,row,col,bup,bld,brd)==true){
//            chess[row][col]=1;
//            bup[col]=1;
//            bld[row-col+chess.length-1]=1;
//            brd[row+col]=1;
//           nQueens(chess,qsf+row+"-"+col+", ",row+1,bup,bld,brd);
//            chess[row][col]=0;
//             bup[col]=0;
//            bld[row-col+chess.length-1]=0;
//            brd[row+col]=0;
//        }
//    }
//   }
  
//   public static boolean isSafe(int[][] chess,int i,int j,int[] bup,int[] bld,int[] brd){
      
//       if(bup[j]==1){
//           return false;
//       }
//       if(bld[i-j+chess.length-1]==1){
//           return false;
//       }
//       if(brd[i+j]==1){
//           return false;
//       }
      
//       return true;
      
//   }

// }
