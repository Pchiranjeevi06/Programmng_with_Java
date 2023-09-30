package SORTING_ALGORITHMS;

import java.util.Arrays;
public class Selecton_sort {
    public static void main(String[] args) {
     int[] arr={4,48,2,3};
     selection_sort1(arr);
     selection_sort2(arr);
    System.out.println(Arrays.toString(arr));    }

    // select maximum element and placed at last
    static void selection_sort1(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=last;
            for (int j=0;j<last;j++){
             if (arr[max]<arr[j]){
                max =j;}
            }
            int temp =arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
        }
    }

    // select minimum element and placed at first
    static void selection_sort2(int[] arr)
    {
        int n= arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

    }
}

