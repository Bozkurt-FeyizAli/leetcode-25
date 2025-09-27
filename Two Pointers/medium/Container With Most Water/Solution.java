class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int width=r-l;
            int h=Math.min(height[l], height[r]);
            int area=h*width;
            if(maxArea<area)
                maxArea=area;
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;

    }
}