class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\sa-zA-Z0-9]", "");
        s=s.strip();
        if(s.length()<2) return true;
        int st=0;
        int fn=s.length()-1;
        while(st<fn){
            if(s.charAt(st)!=s.charAt(fn))
                return false;
            st++;
            fn--;
        }
        return true;
    }
}