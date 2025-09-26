class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        for (int i = 0; i < res.length; i++) {
            for (int j = i+1; j < res.length; j++) {
                if(numbers[i]+numbers[j]==target){
                    res[0]=i; res[1]=j;
                }
            }
        }
        return res;
    }
}