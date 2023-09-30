package permutations;

import java.util.HashMap;

public class p1 {
    public static int numIdenticalPairs1(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        for(int n: count.values()){
            if(n > 1){
                res += (n-1)*(n)/2;
            }
        }
        return res;
    }
    public static int numIdenticalPairs2(int[] nums) {
        int freq[] = new int[100];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - 1] += 1;
            count += freq[nums[i] - 1] - 1;
        }
        return count;
    }
    public static int numIdenticalPairs3(int[] nums) {
        int cnt[] = new int[101], res = 0;
        for (int n: nums)
            res += cnt[n]++;
        return res;
    }
    public static int numIdenticalPairs4(int[] nums) {
        int cnt[] = new int[101], res = 0;
        for (int n: nums)
            ++cnt[n];
        for (int i = 0; i <= 100; ++i)
            res += cnt[i] * (cnt[i] - 1) / 2;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs2(new int[]{1,2, 3,1,1,3}));
    }

}
