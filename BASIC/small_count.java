package BASIC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class small_count {
    public static int[] smallerNumbersThanCurrent1(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();

        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }

        return copy;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] copy =new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j]) {

                    count += 1;
                }
            }
            for (int j = 0; j < copy.length; j++) {
                copy[i]=count;
            }
        }

        return copy;
    }


    public static void main(String[] args) {
        int[] result = smallerNumbersThanCurrent1(new int[]{8,1,2,2,3});
        System.out.println(Arrays.toString(result));
    }

}


