package ARRAYS;

import java.util.Arrays;

public class plus {
    public static void main(String[] args) {

    int []digits={1,2,3,9};
    System.out.println(Arrays.toString(b(digits)));
    }
    static int[] b(int []digits){
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
        return digits;
}
}
