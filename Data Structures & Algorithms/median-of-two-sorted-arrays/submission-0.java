class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        int median1 = 0, median2 = 0;
        for(int count = 0; count <= (m + n) / 2; count++){
            median2 = median1;
            if(i < m && j < n){
                if(nums1[i] > nums2[j]){
                    median1 = nums2[j];
                    j++;
                }else{
                    median1 = nums1[i];
                    i++;
                }
            }else if(i < m){
                median1 = nums1[i];
                i++;
            }else{
                median1 = nums2[j];
                j++;
            }
        }
        if((m + n) % 2 == 1){
            return (double) median1;
        }else{
            return (median1 + median2) / 2.0;
        }
    }
}
