class Solution {
    public int[] leftRightDifference(int[] nums) {

        if(nums.length == 1){
            return new int[]{0};
        }
       

        int[] presum = new int[nums.length];

        for(int i = 1; i < nums.length; i++){
        presum[i] = presum[i-1] + nums[i-1];
        }

        int[] sufsum = new int[nums.length];
        sufsum[nums.length-1] = 0;
        for(int i =nums.length -2; i>=0; i--){
            sufsum[i] = sufsum[i+1]+nums[i+1];
        }
            int[] ret = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            ret[i] = Math.abs(presum[i] - sufsum[i]);
        }
    return ret;}
}