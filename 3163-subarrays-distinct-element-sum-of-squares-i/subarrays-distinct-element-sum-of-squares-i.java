class Solution {
    public int sumCounts(List<Integer> nums) {

        int ret = 0;
        for(int i =0; i<nums.size(); i++){
            boolean[] visited = new boolean[101];
            int count =0;
            for(int j =i; j<nums.size(); j++){
                if(!visited[nums.get(j)]){
                    visited[nums.get(j)] = true;
                    count++;
                }
                    ret += count * count;
            }

        }
        
    return ret;}
}