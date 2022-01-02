package Level2.ArrayAndString;


import java.util.*;
 
 public class RangeAddition {
 
     // This is a functional problem. You have to complete this function.
     // It takes as input a length and a 2D array of update operations.
     // It should return the modified array.
     public static int[] Range(int length, int[][] updates) {
         // write your code here. 
         int[] arr=new int[length];


        for(int i=0;i<updates.length;i++){

            int si=updates[i][0];
            int ei=updates[i][1];
            int inc=updates[i][2];


            arr[si]+=inc;

            if(ei+1<arr.length){
                arr[ei+1]+=-inc;
            }
        }

        int[] ans=new int[length];
        ans[0]=arr[0];
        for(int idx=1;idx<arr.length;idx++){
             ans[idx]=arr[idx]+ans[idx-1];
        }
        return ans;
         
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Input for length of first array.
         int length = sc.nextInt();
 
         int K = sc.nextInt();
 
         int[][] updates = new int[K][3];
 
         for (int i = 0; i < updates.length; i++) {
             for (int j = 0; j < updates[0].length; j++) {
                 updates[i][j] = sc.nextInt();
             }
         }
 
         int[] result = Range(length, updates);
         display(result);
     }
 
     // function to display an array.
     public static void display(int[] arr) {
 
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
 
         System.out.println();
     }
 
 }