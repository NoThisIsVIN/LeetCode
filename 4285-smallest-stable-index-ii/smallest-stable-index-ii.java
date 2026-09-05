class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int ret = 0;
        int premax = nums[0];
        int[] premin = new int[nums.length]; 
        premin[nums.length-1] = nums[nums.length-1];

        for(int i =nums.length-2 ;i>=0; i--){
            premin[i] = Math.min(premin[i+1],nums[i]);
        }

        for(int i =0; i<nums.length; i++){

            if(premax<nums[i]){
                premax = nums[i];
            }

            int instability = premax - premin[i];
          
            if (instability <= k){
                    return i;
            }
        }
    return -1;}
}
           

        


   