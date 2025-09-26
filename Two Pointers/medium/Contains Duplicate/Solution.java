import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for (Integer integer : nums) {
            set.add(integer);
        }
        if (set.size()==nums.length) return false;
        else return set.size()<nums.length;
    }
}