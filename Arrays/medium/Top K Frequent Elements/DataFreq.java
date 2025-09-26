import java.util.TreeMap;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res= new int[k];
        TreeMap<Integer, Integer> map= new TreeMap<>();
        for (int i : nums) {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else map.putIfAbsent(i, 1);
        }
        int beforeK=0;
        for (int i=0;i<k;i++) {
        int maxV=0;
        int maxK=0;
        for (var var1 : map.entrySet()) {
            int key=var1.getKey();
            int val=var1.getValue();
            if(key==beforeK) continue;
            if(val>maxV){
                maxV=val;
                maxK=key;
            }
        }
        beforeK=maxK;
        res[i]=maxK;
        }
        return res;
    }
}