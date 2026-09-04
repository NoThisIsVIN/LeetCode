class Solution {
    public int pivotIndex(int[] nums) {

        int sum = nums [0];

        for ( int i = 1; i<nums.length; i++){
            sum += nums[i]; 
        }

        int rightsum = sum - nums[0];

        int leftsum = 0;

if ( rightsum == leftsum){
    return 0;
}


        for (int i = 1; i<nums.length; i++){
            rightsum -= nums[i];
            leftsum += nums[i-1];

            if (rightsum == leftsum){
                return i;
            }
        }        
    return -1;}
}