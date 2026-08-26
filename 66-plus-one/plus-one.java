class Solution {
    public int[] plusOne(int[] digits) {

boolean allNine = true;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                allNine = false;
            }
        }

        if (allNine) {
            int[] r = new int[digits.length + 1];
            r[0] = 1;
            return r;
        }

        int[] r = digits.clone();

        for (int i = r.length - 1; i >= 0; i--) {

            if (r[i] == 9) {
                r[i] = 0;
            } else {
                r[i]++;
                return r;
            }
        }

        
    return r;}
}