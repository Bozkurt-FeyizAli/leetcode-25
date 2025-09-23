class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letters= new int[26];
        for (char c : s.toCharArray()) {
            letters[c-'a']=letters[c-'a']+1;
        }
        for (char c : t.toCharArray()) {
            letters[c-'a']=letters[c-'a']-1;
        }
        for(int b: letters){
            if(b!=0) return false;
        }
        return true;
    }
}