class Solution {
    public int maxArea(int[] height) {
        int ma = 0;
        int left = 0;
        int right = height.length -1;

    while (left < right){
        int ch = Math.min(height[left], height[right]);
        int w = right - left;
        int cc = ch * w;
         ma = Math.max(ma, cc);
        if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
    }
    return ma;}


    }
