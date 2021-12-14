import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int idx=0;idx<n;idx++){
        int v=scn.nextInt();
     
        String ans="";
        boolean check=false;
        String[] arr=new String[v-2];
       
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.next();
        }
        
        ans+=arr[0];

        if(v==3){
            System.out.println(ans+"b");
            continue;
        }

        for(int i=1;i<arr.length;i++){

          if(arr[i].charAt(0)==arr[i-1].charAt(1)){
              ans+=arr[i].charAt(1);
          }else{
              ans+=arr[i];
          }

        }
       System.out.println(ans);

     }
    }
 }
       