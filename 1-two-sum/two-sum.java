class Solution {
    public int[] twoSum(int[] nums, int target) {


        int[] a = new int[nums.length];
        a = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);

        int low = 0;

        int high = nums.length - 1;

        int[] r = new int[2];

        while(low < high){

            if (nums[low]+nums[high] == target){
                r[0] = nums[low];
                r[1] = nums[high];
                break;
            }

            if (nums[low]+nums[high] < target){
                low++;
            }
            if (nums[low]+nums[high] > target){
                high--;
            }

        }
   int index = -1;

for (int i = 0; i < a.length; i++) {
    if (a[i] == r[0]) {
        r[0] = i;
        index = i;
        break;
    }
}

for (int i = 0; i < a.length; i++) {
    if (i != index && a[i] == r[1]) {
        r[1] = i;
        break;
    }
}
        
    return r;}
}