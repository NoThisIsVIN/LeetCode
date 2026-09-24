class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1){
            return nums[0];
        }

        double sum = 0;
        double max = Integer.MIN_VALUE;
        double avg = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(i>=k){
                sum = sum - nums[i-k];
            }
            if(i>=k-1){
                avg = sum / k;
                max = Math.max(max,avg);
            }
        }
        
    return max;}
}