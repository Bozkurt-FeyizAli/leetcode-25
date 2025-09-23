package Arrays.easy;

import java.util.HashSet;
import java.util.Set;

class hasDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for (Integer integer : set) {
            set.add(integer);
        }
        return (set.size()==nums.length);
    }
}
