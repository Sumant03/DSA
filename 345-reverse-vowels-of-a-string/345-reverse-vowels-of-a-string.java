class Solution {
    public static boolean IsVowel(char ch){
        String str="aeiouAEIOU";
        
        int idx=str.indexOf(ch);
        
        if(idx==-1){
            return false;
        }else{
            return true;
        }
    }
    
    public String reverseVowels(String s) {
        
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        
      while(j>i){
            
            while(i<j&IsVowel(s.charAt(i))==false){
                i++;
            }
          while(i<j&IsVowel(s.charAt(j))==false){
                j--;
            }
          
          char temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
        
      return new String(arr);
        
        
        
        
    }
}