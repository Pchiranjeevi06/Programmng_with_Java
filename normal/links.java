package normal;

class links{
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int count = 0;
        int i = 0;
        int j = 0;
        int k=0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                count++;
                i++;
                j++;
                k=j;
            } else {
                if (k==nums2.length-1) {
                    i++;
                }
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 1, 2, 5};
        int[] nums2 = {10, 5, 2, 1, 5, 2};
        int result = maxUncrossedLines(nums1, nums2);

        System.out.println("Output: " + result);
    }
}
