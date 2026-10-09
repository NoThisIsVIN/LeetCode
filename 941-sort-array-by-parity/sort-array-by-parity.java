class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int p1 =0;
        int p2 =nums.length -1;

        while(p2>p1){
            if(nums[p1]%2 != 0 && nums[p2]%2 ==0){
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p2--;
                p1++;
            }
            else if(nums[p1]%2 ==0 && nums[p2]%2 ==0){
                p1++;
            }
            else if(nums[p1]%2 !=0 && nums[p2]%2 !=0){
                p2--;
            }
            else{
                p2--;
                p1++;
            }
        }
    return nums;}
}