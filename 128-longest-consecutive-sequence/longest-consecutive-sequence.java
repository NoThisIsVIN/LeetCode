class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        HashSet<Integer> set = new HashSet<>();
        int max =0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            int count =1;
            int current = num;
            if(set.contains(current-1)){
                continue;
            }
            while(set.contains(current+1)){
                count++;
                current++;
            }
            max = Math.max(max,count);
        }
    return max;}
}