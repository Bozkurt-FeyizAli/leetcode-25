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
            if((before-integer)==1){
                l++;
            }
            else if(l>res){
                    res=l+1;
                    l=0;
            }
            before=integer;
            System.out.println(integer);
            
        }
        System.out.println(l);
        if(l>res){
                    res=l+1;
            }
        return res;
    }
}