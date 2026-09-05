class Solution {
    public int largestAltitude(int[] gain) {

        int[] gaina = new int[gain.length+1];

            gaina[0] = 0;

        for(int i =0; i<gain.length; i++){
            gaina[i+1] = gain[i] + gaina[i];
        }

        int max = gaina[0];

        for ( int i =0; i<gaina.length; i++){
            if ( gaina[i]> max){
                max = gaina[i];
            }
        }
        

    return max;}
}