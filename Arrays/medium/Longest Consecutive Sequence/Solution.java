import java.util.TreeSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        TreeSet<Integer> map= new TreeSet<>();
        for (Integer integer : nums) {
            map.add(integer);
        }
        int before= map.first();
        int l=0;
        for (Integer integer : map.descendingSet()) {
            if(Math.abs(integer-before)<2){
                l++;
            }
            else{
                if(l>res){
                    res=l;
                    l=0;
                }
            }
            before=integer;
        }

        return res;
    }
}