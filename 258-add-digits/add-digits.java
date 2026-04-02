class Solution {
    public int addDigits(int num) {
     if( num ==0 )
            return num;
    while(num >= 10){
        int s = 0;
            while(num>0){
            s += num % 10;
           num = num/10;
            }
        num = s;
                    }
    return num;}
}