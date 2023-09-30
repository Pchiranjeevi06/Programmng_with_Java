package ARRAYS;

import java.lang.reflect.Array;
import java.util.Arrays;

class majority {


    static int findMajority(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static void main(String[] args)
    {

        int arr[] = { 1, 1, 2, 2, 1, 5, 1 };
        int n = arr.length;

        // Function calling
        int a=findMajority(arr, n);
        System.out.println(a);
    }
    // This code is contributed by ajit.
}

