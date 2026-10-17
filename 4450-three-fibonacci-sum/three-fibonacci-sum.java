class Solution {
    public boolean threeFibonacciSum(int n) {

        int first = 0; 
        int second = 1;

        while(true){
            
            int third = first + second;

            if(first + second + third == n){
                return true;
            }

            if(first+second+third > n){
                return false;
            }

            first = second;
            second = third;

        }
        
    }
}