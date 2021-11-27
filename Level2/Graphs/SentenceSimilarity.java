// import java.util.HashMap;

// public class SentenceSimilarity {
//     /**
//      * @param words1: 
//      * @param words2: 
//      * @param pairs: 
//      * @return: Whether sentences are similary or not?
//      */

//      HashMap<String,String> parent;
//      HashMap<String,Integer> rank;
//     public boolean areSentencesSimilarTwo(List<String> words1, List<String> words2, List<List<String>> pairs) {
//         // 


//         parent =new HashMap();
//         rank   =new HashMap();

//         for(int i=0;i<pairs.size;i++){
//             String s1=pairs.get(i).get(0);
//             String s2=pairs.get(i).get(1);

//               if(parent.containsKey(s1)==false){
//                   parent.put(s1,s1);
//                   rank.put(s1,0);
//               }    

//               if(parent.containsKey(s2)==false){
//                   parent.put(s2,s2);
//                   rank.put(s2,0);
//               }
//         }       

//        for(int i=0;i<pairs.size();i++){
//            String s1=pairs.get(i).get(0);
//             String s2=pairs.get(i).get(1);

//             String l1=find(s1);
//             String l2=find(s2);


//             if(l1!=l2){
//                 if(rank.get(l1)<rank.get(l2)){
//                     parent.put(l1,l2);
//                 }else if(rank.get(l2)>rank.get(l1)){
//                     parent.put(l2,l1);
//                 }else{
//                     parent.put(l1,l2);
//                     rank.put(l2,rank.get(l2)+1);
//                 }
//             }



//        }

     
//  //check if two words are not similary

//  for(int i=0;i<word1.size;i++){
//      String w1=word1.get(i);
//      String w2=word2.get(i);

//      if(w1.equals(w2)==true){
//          continue;
//      }

//      if(parent.containsKey(w1)==false||parent.containsKey(w2)==false){
//          return false;
//      }

//     String pw1 =find(w1);
//     String pw2=find(w2);

//     if(pw1!=pw2){
//         return false;
//     }

//  }
//  return true;
 
 
 
//  )



//     }
//     public static String find(String x){
//         if(parent.get(x).equals(x)==true){
//             return x;
//         }else{
//             String ans=find(parent.get(x));
//             parent.put(x,ans);
//             return ans;
//         }
//     }
// }