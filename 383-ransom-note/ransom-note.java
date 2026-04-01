class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int c = 0;

        for ( int i = 0; i < ransomNote.length(); i++){
            

            for( int j =0; j < magazine.length(); j++){

                if(ransomNote.charAt(i) == magazine.charAt(j)){

                    c++;
                    magazine = magazine.substring(0, j) + " " + magazine.substring(j + 1);
                    break;
                }
            }
        }
     
     return c== ransomNote.length();}
 
}