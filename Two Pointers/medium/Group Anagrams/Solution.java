import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups= new ArrayList<>();
        HashSet<Integer> visited= new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            if(visited.contains(i)) continue;
            List<String> group= new ArrayList<>();
            if(!visited.contains(i)){ group.add(strs[i]);
            visited.add(i);}
            for (int j = i+1; j < strs.length; j++) {
                if(visited.contains(j)) continue;
                if(group.isEmpty()) {group.add(strs[j]); visited.add(j);}
                else if(isAnagram(group.get(0), strs[j])){
                    group.add(strs[j]);
                visited.add(j);}
            }
            groups.add(group);
            
        }
        return groups;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
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