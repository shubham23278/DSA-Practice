class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];    
        }
        
        for (int i = 1; i < nums1.length; ++i) {
            int key = nums1[i];
            int j = i - 1;
            while (j >= 0 && nums1[j] > key) {
                nums1[j + 1] = nums1[j];
                j = j - 1;
            }
            nums1[j + 1] = key;
        }

    }
}
