class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int out = 0;
        int sum = 0;
        int avg = 0;

        for(int i=0; i<arr.length; i++){

            sum += arr[i];

            if(i>=k){
                sum -= arr[i-k];
            }

            if(i>=k - 1){
                avg = sum/k;

                if( avg >= threshold){
                    out++;
                }
            }
        }

    return out;}
}