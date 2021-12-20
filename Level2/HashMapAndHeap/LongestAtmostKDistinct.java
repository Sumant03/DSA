// package Level2.HashMapAndHeap;


// import java.util.*;

// public class LongestAtmostKDistinct {

// 	public static int solution(String s, int k) {
// 		// write your code here
//   int i=-1;
//         int j=-1;

//         if(s.length()<k){
//             return -1;
//         }
        
//         HashMap<Character,Integer> map=new HashMap<>();
        
//         int ans=-1;
//         while(i<s.length()-1){
//          //acquire
//         while(i<s.length()-1&&map.size()<=k){
//             i++;
            
//             char ch=s.charAt(i);
//             int nf=map.getOrDefault(ch,0)+1;
//             map.put(ch,nf);
            
//             if(map.size()<=k){
//                 //
//                 int len=i-j;
//                 ans=Math.max(len,ans);
//             }
//         }
        
//         while(j<i){
//             j++;
            
//             char ch=s.charAt(j);
            
//             if(map.get(ch)==1){
//                 map.remove(ch);
//                 break;
//             }else{
//                 int nf=map.get(ch)-1;
//                 map.put(ch,nf);
//             }
//         }
        
//         }
//         return ans;
// 	}
	
// 	public static void main(String[] args) {
// 		Scanner scn = new Scanner(System.in);
//         String str = scn.next();
//         int k = scn.nextInt();
// 		System.out.println(solution(str,k));
// 	}

// }

