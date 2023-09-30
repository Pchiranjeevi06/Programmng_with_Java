package normal;

import java.util.ArrayList;
import java.util.List;

class candies{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> b = new ArrayList<>(candies.length);
        for (int i : candies) {
            int k = i + extraCandies;
            if (k >= max) {
                b.add(true);
            } else {
                b.add(false);
            }
        }
        return b;
    }

    public static void main(String[] args) {
        candies s = new candies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
