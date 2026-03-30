class Solution {
    public int[] runningSum(int[] nums) {
        
        int x = 0;
        int[] r = new int[nums.length];

        for(int i=0; i< nums.length; i++ ){
            x += nums[i];
            r[i] = x;
        }
    
        return r;    }
}