package ARRAYS;

import java.util.Arrays;

class Move_zerors_at_end {



    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]!=0) {
                continue;
            }
            int j=i;
            while(j<n-1 && nums[j]==0) {
                j++;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

        }
    }

    public static void main(String[] args) {
        int[] nums={1,0,33,4,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
