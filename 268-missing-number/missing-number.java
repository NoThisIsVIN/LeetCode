class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);

    int p1 =0;
    int p2 =1;

    if (nums.length != nums[nums.length-1]){

        return nums[nums.length-1] + 1;

    }

    if (nums[0] != 0){
        return 0;
    }


    while(p2< nums.length){

        if (nums[p2]- nums[p1] == 1){
            p1++;
            p2++;
        }else{
            return nums[p1] + 1;
        }
    }
    return -1;}
}