class Solution {
    public boolean isHappy(int n) {

        HashSet <Integer> set = new HashSet<>();

        

        while(n>1){
            int digit =0;
            while(n>0){
                
                digit += (n % 10) * (n % 10);
                n = n/10;
            }
            if(set.contains(digit)){
                return false;
            }
            set.add(digit);
            n = digit;
            
        }
        
    return true;}
}