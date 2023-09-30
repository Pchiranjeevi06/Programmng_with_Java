package ITERATION;

import java.util.Arrays;
class count_less_than_elements {
    public static int[] s(int[] nums) {
        int[] buck = new int[101];

        for(int i=0; i<nums.length; i++) {
            buck[nums[i]] +=1;
        }

        for(int j=1; j<= 100; j++) {
            buck[j] += buck[j-1];
        }

        for(int k=0; k< nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos==0 ? 0 : buck[pos-1];
        }

        return nums;
    }

    public static void main(String[] args) {
        int [] b=s(new int[]{8,1,2,2,3});
        System.out.println(Arrays.toString(b));
}
}