package ARRAYS;

class solution {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;

        int left = 0;
        for (int r=1;r< len;r++) {
            if (nums[r] > nums[left]) {
                left++;
                nums[left] = nums[r];
            }
        }
        return left+1;
    }

    public static void main(String[] args) {
        int []nums={1,1,2,2};
        System.out.println(removeDuplicates(nums));

    }
}
