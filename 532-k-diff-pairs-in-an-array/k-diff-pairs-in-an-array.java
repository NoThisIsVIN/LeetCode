class Solution {
    public int findPairs(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        

        for(int num : nums){
            set.add(num);
        }
        int count =0;

        if(k==0){
            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> dup = new HashSet<>();
            for(int num : nums){
                if(!seen.add(num)){
                    dup.add(num);
                }
            }
        return dup.size();}

        for(int num: set){
            if(set.contains(num+k)){
                count++;
            }
        }
    return count;}
}