class Solution {
    public int firstUniqChar(String s) {

        for(int i =0 ; i<s.length(); i++){
            char n = s.charAt(i);
            
          if(s.indexOf(n) == s.lastIndexOf(n))
                return i; 
        }
        
    return -1;}
}