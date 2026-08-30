class Solution {
    public void rotate(int[] nums, int k) {
        int[] r = new int[nums.length];
        int c =0;
        k = k % nums.length;
        for ( int i =nums.length -k ; i< nums.length  ; i++){
            r[c] = nums[i];
            c++;   
        }
        for ( int i = 0; i< nums.length -k ; i++){
            r[c] = nums[i];
            c++;
        }
        for (int i = 0; i<nums.length; i++){
            nums[i] = r[i];
        }        
    }
}