class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0;
        int z =0;
        for (int i =0; i<nums.length; i++){
            if ( nums[i] != 0){
                nums[c] = nums[i];
                c++;
            }
            if(nums[i]== 0){
                z++;
            }
        }
        for(int i=nums.length - z ; i<nums.length; i++ ){
            nums[i] = 0;
        }
        
    }
}