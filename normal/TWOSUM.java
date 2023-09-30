package normal;

import java.util.*;

class TWOSUM {


    public static void main(String[] args) {

        System.out.println(twoSum1(new ArrayList<>(Arrays.asList(2, 7, 11, 15)),9));
        System.out.println(Arrays.toString(twoSum((new int[]{2, 7, 11, 15}),9)));
    }

    public static List<Integer> twoSum1(List<Integer> nums, int target) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int currentNum = nums.get(i);
            int complement = target - currentNum;

            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) == complement) {
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return result;
    }
        public static int[] twoSum(int[] nums, int target){
            Map<Integer, Integer> numIndices = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numIndices.containsKey(complement)) {
                    return new int[]{numIndices.get(complement), i};
                }
                numIndices.put(nums[i], i);
            }
            return null;
        }


}