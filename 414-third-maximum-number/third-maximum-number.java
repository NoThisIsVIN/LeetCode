class Solution {
    public int thirdMax(int[] nums) {
        
        int max = nums[0];
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        boolean secondFound = false;
        boolean thirdFound = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {

                if (secondFound) {
                    tmax = smax;
                    thirdFound = true;
                }

                smax = max;
                secondFound = true;
                max = nums[i];

            } else if (nums[i] < max && (!secondFound || nums[i] > smax)) {

                if (secondFound) {
                    tmax = smax;
                    thirdFound = true;
                }

                smax = nums[i];
                secondFound = true;

            } else if (nums[i] < max && nums[i] < smax &&
                       (!thirdFound || nums[i] > tmax)) {

                tmax = nums[i];
                thirdFound = true;
            }
        }

        if (!thirdFound) {
            return max;
        }

        return tmax;
    }
}