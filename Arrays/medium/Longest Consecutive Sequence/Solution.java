class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map= new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            map.add(nums[i]);
        }
        int res=0;
        HashSet<Integer> visited= new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int n=nums[i];
            if(map.contains(n-1)||visited.contains(n)) continue;
            int l=1;
            visited.add(n);
            while(map.contains(n+1)){
                l++;
                n=n+1;
            }
            if(l>res){
                res=l;
            }
        }
        return res;
    }
}

