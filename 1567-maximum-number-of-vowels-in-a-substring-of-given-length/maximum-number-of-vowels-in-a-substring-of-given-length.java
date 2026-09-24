class Solution {

    boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
}

    int sum =0;
    int max = Integer.MIN_VALUE;

    public int maxVowels(String s, int k) {
        for(int i =0; i<s.length(); i++){

            if (isVowel(s.charAt(i))){
                sum++;
            }

            if(i>=k){
                if(isVowel(s.charAt(i-k))){
                    sum--;
                }
            }
            if (i>=k-1){
                max =Math.max(max,sum);
            }
            
            

        }
    return max;}
}