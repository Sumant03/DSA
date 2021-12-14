import java.util.*;

public class Main {
    
    static int k;
    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();

        // System.out.println(t);
        for(int i=0;i<t;i++){

         int n=scn.nextInt();

         int[] arr=new int[n];


        for(int idx=0;idx<n;idx++){
            arr[idx]=scn.nextInt();
        }
          k=1;
        
         for(int j=0;j<n;j++){
           
             if(arr[j]==0){
 
                if(j>0){
                    
                if(arr[j-1]==0){
                  
                    k=-1;
                    // System.out.println("breaking loop");
                    break;
                }
            }
             }
             if(arr[j]==1){
                //   System.out.println("in 1");
                if(j==0){
                  k+=1;
                }else if(arr[j-1]==0){
                  k+=1;
                }else{
                  k+=5;  
                }

             }

              
         }

        System.out.println(k);

        }
    }
}
