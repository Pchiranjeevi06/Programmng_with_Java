package ARRAYS;

public class count_good_pairs {
    public static int numIdenticalPairs(int[] A) {
        int res = 0, count[] = new int[10];
        for (int a: A) {
            int k=count[a]++;
            res+=k;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
}
