class Solution {
    public int maximumWealth(int[][] accounts) {
        int i = 0;
        int j = 0;
        int r = 0;
        int c =0 ;
        int max =0;

        for(i = 0; i < accounts.length; i++){
            
            c = 0;

            for(j = 0; j< accounts[i].length ; j++){

                    c += accounts[i][j];

            }

            if ( max < c){
                max = c;
            }
           

        }
        
    return max; }
}