class Solution {
public:
    bool isPalindrome(int x) {
        int m= 0; 
        long long r = 0;
        int o = x;
        if ( x < 0 )
            return false;
        while( x !=0 ){
            m = x%10;
            r = r*10 + m;
            x = x/10;
            }
        if (o==r)
            return true;
        else
            return false;
    }
};