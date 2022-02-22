class Solution {
  public int titleToNumber(String s) {
         
      int sum=0;
      for(int i=0;i<s.length();i++){
          sum+=Math.pow(26,i)*((int)s.charAt(s.length()-i-1)-64);
      }
      return sum;
    }
}