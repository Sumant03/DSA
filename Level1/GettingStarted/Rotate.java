
// import java.util.*;
   
//    public class Rotate{
   
//    public static void main(String[] args) {
//      // write your code here  
     
//      Scanner scn=new Scanner(System.in);
//      int n=scn.nextInt();
//      int k=scn.nextInt();
     
//     int count=0;
//     int num=n;
//     while(num>0){
//         num=num/10;
//         count++;
//     }
     
//      k=k%count;
     
//      if(k<0){
//          k=k+count;
//      }
     
//      int pow=(int)Math.pow(10,k);
//      int digit=n%pow;
//      n=n/pow;
     
//      int val=digit*(int)Math.pow(10,count-k);
//      n=n+val;
//      System.out.println(n);
     
     
//      scn.close();
//     }
//    }