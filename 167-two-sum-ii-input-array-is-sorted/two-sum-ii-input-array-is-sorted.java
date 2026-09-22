class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int p1 = 0;
        int p2 = numbers.length - 1;

        int[] ind = new int[2];

        while(p2>p1){
            if(numbers[p2]+numbers[p1] == target){
                ind[0] = p1 + 1;
                ind[1] = p2 + 1;
                return ind;
            }

            if(numbers[p2]+numbers[p1] < target){
                p1++;
            }else{
                p2--;
            }
            
        }
    return ind;}
        
    
}