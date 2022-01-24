class Solution {
    public boolean detectCapitalUse(String str) {
        if(str.length()==0){
            return true;
        }
        int c1=0;
        int c2=0;
        
        int c3=(int)(str.charAt(0));
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int val=(int)ch;
            
            if(val>=65&&val<=96){
                c1++;
            }
            if(val>=97&&val<=122){
                c2++;
            }
            
        }
        if(c1>0&&c2==0){
            return true;
        }else if(c1==0&&c2>0){
            return true;
        }else if(c2>0&&(c3>=65&&c3<=96)&&c1==1){
            return true;
        }else{
            return false;
        }
    }
}