// package Level2.Graphs;


// class SatisfiabilityOfEquality {
    
//     static int[] par;
//     static int[] rank;
     
//      public boolean equationsPossible(String[] equations) {
//            par=new int[26];
//            rank=new int[26];
         
//          for(int i=0;i<26;i++){
//              par[i]=i;
//              rank[i]=0;
//          }
         
//          for(int i=0;i<equations.length;i++){
             
//              String str=equations[i];
//              int c1=str.charAt(0);
//              int c2=str.charAt(3);
             
//              if(str.charAt(1) == '='){
//                  int i1=c1-'a';
//                  int i2=c2-'a';
                 
//                 union(i1,i2);
//              }
             
             
//          }
//            for(int i=0;i<equations.length;i++){
             
//              String str=equations[i];
//              int c1=str.charAt(0);
//              int c2=str.charAt(3);
             
//              if(str.charAt(1) == '!'){
//                  int i1=c1-'a';
//                  int i2=c2-'a';
                 
//                  int lx=find(i1);
//                  int ly=find(i2);
                 
//                  if(lx==ly){
//                      return false;
//                  }
                 
//              }
             
             
//          }
         
         
//          return true;
         
//      }
     
//      public static void union(int i1,int i2){
//           int fc=find(i1);
//           int sc=find(i2);
                 
                 
//                  if(fc!=sc){
                     
//                      if(rank[fc]<rank[sc]){
                         
//                          par[fc]=i2;
//                      }else if(rank[fc]>rank[sc]){
//                      par[sc]=i1;
//                      }else{
//                          par[fc]=i2;
//                          rank[i2]++;
//                      }
                     
                     
//                  }
                 
//      }    
                
//      public static int find(int val){
         
//          if(par[val]==val){
//              return val;
//          }else{
//              int ans=find(par[val]);
//              par[val]=ans;
//              return ans;
//          }
         
         
         
//      }           
                
//  }