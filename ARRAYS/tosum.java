package ARRAYS;

import java.util.*;

class tosum {
    public int[] twoSum_n2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    public int[] twoSum_nlognn(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == sortedNums[left] || nums[i] == sortedNums[right]) {
                result[0] = i;
                if (nums[i] != sortedNums[left]) {
                    result[1] = left;
                } else {
                    result[1] = right;
                }
                break;
            }
        }
        return result;
    }
    public int[] twoSum_set(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i])) {
                int j = 0;
                for (int num : nums) {
                    if (num == target - nums[i]) {
                        break;
                    }
                    j++;
                }
                return new int[] {j, i};
            }
            set.add(nums[i]);
        }
        return new int[] {};
    }
    public int[] twoSum_map(int[] nums, int target) {
        Map<Integer, Integer> nu = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nu.containsKey(target - nums[i])) {
                return new int[] {nu.get(target - nums[i]),i};
            }
            nu.put(nums[i], i);
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;

        tosum solution = new tosum();

        int[] result = solution.twoSum_n2(nums, target);
        System.out.println(Arrays.toString(result));

        int[] result1 = solution.twoSum_nlognn(nums, target);
        System.out.println(Arrays.toString(result1));

        int[] result2 = solution.twoSum_set(nums, target);
        System.out.println(Arrays.toString(result2));

        int[] result3 = solution.twoSum_map(nums, target);
        System.out.println(Arrays.toString(result3));
    }
}
