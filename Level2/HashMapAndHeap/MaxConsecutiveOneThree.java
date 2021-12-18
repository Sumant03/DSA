package Level2.HashMapAndHeap;
import java.util.*;
class MaxConsecutiveOneThree {
    public int longestOnes(int[] nums, int k) {
         int i=-1;
        int j=-1;

int ans=0;
        int co=0;
        int cz=0;

        while(i<nums.length-1){

            while(i<nums.length-1&&cz<=k){
             i++;
                  if(nums[i]==0){
                      cz++;
                  }

                  if(cz<=k){
                        int len=i-j;
                        ans=Math.max(ans,len);      

                  }

            }

            while(j<i){
                j++;

            if(nums[j]==0){
                cz--;
                break;
            }


            }

        }
        return ans;
    }
}
