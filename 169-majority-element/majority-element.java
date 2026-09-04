class Solution {
    public int majorityElement(int[] nums) {
        
Arrays.sort(nums);

int p1 = 0;
int p2 = 1;

int count = 1;

if (nums.length == 1){
    return nums[0];
}

while (p2<nums.length){

    if (nums[p1] == nums[p2]){
        count++;
            p2++;
    }
    else{
        count = 1;
        p1 = p2;
        p2++;
    }

    if (count > nums.length/2){
        return nums[p1];
    }

        
    }
return -1;}
}