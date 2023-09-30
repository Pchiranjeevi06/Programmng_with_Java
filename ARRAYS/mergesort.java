package ARRAYS;

import java.util.Arrays;

class mergesort{
    public static String merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;
            } else {
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }
// Copy the result array back to nums1
        for (i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
        return Arrays.toString(nums1);
    }

        public static void main(String[] args) {
        int[] nums1={1,2,3};
      int  m=1;
        int[] nums2={2,5,6};
        int n=0;

        System.out.println( merge(nums1,m,nums2, n));
    }
}

