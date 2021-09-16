// import java.util.*;
// class ArrayR {
//   public static void main(String[] args){
//      Scanner scn=new Scanner(System.in);
//     System.out.println("Pls enter total no. be values");
//      int n=scn.nextInt();
//      int arr[]=new int[n];
//   System.out.println("Hi im asking to print values");
//      for(int i=0;i<arr.length;i++){
//          arr[i]=scn.nextInt();

//      }
//      int temp=0;
//      int lo=0,hi=arr.length-1;
//      while(lo<=hi){
//          temp=arr[lo];
//          arr[lo]=arr[hi];
//          arr[hi]=temp;
//      }
//    display(arr);
//     scn.close();
//   }  
//   public static void display(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//        }
//   }
// }
// public class ArrayR {
     
//     /* Function to reverse arr[] from
//      start to end*/
//      static void rvereseArray(int arr[],
//                      int start, int end)
//      {
//          int temp;
           
//          while (start < end)
//          {
//              temp = arr[start];
//              arr[start] = arr[end];
//              arr[end] = temp;
//              start++;
//              end--;
//          }
//      }    
       
//      /* Utility that prints out an
//      array on a line */
//      static void printArray(int arr[],
//                              int size)
//      {
//          for (int i = 0; i < size; i++)
//               System.out.print(arr[i] + " ");
           
//           System.out.println();
//      }
  
//      // Driver code
//      public static void main(String args[]) {
          
//          int arr[] = {1, 2, 3, 4, 5, 6};
//          printArray(arr, 6);
//          rvereseArray(arr, 0, 5);
//          System.out.print("Reversed array is \n");
//          printArray(arr, 6);
         
//      }
//  }
  
 