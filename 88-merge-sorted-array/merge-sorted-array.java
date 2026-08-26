class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int[] first = new int[m];
        int[] second = new int[n];

        for(int i =0; i<m; i++){
            first[i]=nums1[i];
        }
        for(int i=0; i<n; i++){
            second[i]=nums2[i];
        }
        int[] finals = new int[m+n];

            int p1 = 0;
            int p2 = 0;

        for (int i =0; i< m+n; i++){
                
            if (p1 == m) {
                finals[i] = second[p2];
                p2++;
            }
            else if (p2 == n) {
                finals[i] = first[p1];
                p1++;
            }
            else if (first[p1] <= second[p2]) {
                finals[i] = first[p1];
                p1++;
            }
            else {
                finals[i] = second[p2];
                p2++;
            }
        }
             for(int i =0; i<m+n; i++){
                nums1[i] = finals[i];
            }
    }
}
