class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] r = new int[2*nums.length];
        System.arraycopy(nums, 0, r, 0, nums.length);
        System.arraycopy(nums, 0, r, nums.length, nums.length);
    return r;}
}