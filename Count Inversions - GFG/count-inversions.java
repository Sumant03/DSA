// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long count;
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        
        count=0;
        mergeSort(arr,0,arr.length-1);
        
        return count;
    }
    static long[] mergerArrays(long[] left,long[] right){
        int n=left.length;
        int m=right.length;
        long[] mat=new long[n+m];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<n&&j<m){
            if(left[i]<=right[j]){
                mat[k]=left[i];
                k++;
                i++;
            }else{
                count+=(left.length-i);
                mat[k]=right[j];
                k++;
                j++;
                
            }
        }
        
        while(i<n){
            mat[k]=left[i];
            k++;
            i++;
        }
        
        while(j<m){
            mat[k]=right[j];
            k++;
            j++;
        }
        return mat;
    }
    
    static long[] mergeSort(long arr[],int lo,int hi){
        if(lo==hi){
            long[] ba=new long[1];
             ba[0]=arr[lo];
             return ba;
        }
        
        
        int mid=(lo+hi)/2;
        long arr1[]=mergeSort(arr,lo,mid);
        long arr2[]=mergeSort(arr,mid+1,hi);
        
        long arr3[]=mergerArrays(arr1,arr2);
        return arr3;
    }
    
}