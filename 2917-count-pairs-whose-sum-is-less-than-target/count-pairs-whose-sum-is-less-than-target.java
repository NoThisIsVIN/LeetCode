class Solution {
    public int countPairs(List<Integer> nums, int target) {

        int count =0;

for(int p1 =0; p1<nums.size(); p1++){
    int p2 =nums.size()-1;

        while(p2>p1){
            if(nums.get(p2)+nums.get(p1) < target){
                count++;
            }
            p2--;
        }
}
        
    return count;}
}