package Level2.ArrayAndString;

public class MaxRangeQueryCodeChef {
 public staic void main(String args[]){
    int len=8;
    int[] arr={{1,5},{2,7},{0,3},{6,7}};
    int k=2;

    range_addition(arr,queries);

    int[] kc=new int[len];
    int[] kp1c=new int[len]; //k+1 array , as if k is 2 I'm checking k+1=3;


    kc[0]=arr[0]=k==1?1:0;
    kp1c[0]=arr[0]=k+1==1?1:0;


    for(int i=1;i<arr.length;i++){
        if(arr[i]==k){
            kc[i]=kc[i-1]+1;
        }else{
            kc[i]=kc[i-1];
        }

        if(arr[i]==k+1){
            kp1c[i]=kp1c[i]+1;
        }else{
            kp1c=kp1c[i-1];
        }
    }
    
    


 }
 public static int[] range_addition(int length,int[][] updates){
 
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

}
