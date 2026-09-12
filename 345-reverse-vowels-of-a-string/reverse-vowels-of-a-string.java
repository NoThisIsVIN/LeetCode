class Solution {

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder(s);

int p1 = 0;
int p2 = sb.length() - 1;

while (p1 < p2) {

    if (!isVowel(sb.charAt(p1))) {
        p1++;
    } else if (!isVowel(sb.charAt(p2))) {
        p2--;
    } else {
        char temp = sb.charAt(p1);
        sb.setCharAt(p1, sb.charAt(p2));
        sb.setCharAt(p2, temp);

        p1++;
        p2--;
    }
}
    return sb.toString();}
}