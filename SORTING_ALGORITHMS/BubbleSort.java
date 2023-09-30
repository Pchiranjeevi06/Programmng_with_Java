package SORTING_ALGORITHMS;

import java.util.*;

class BubbleSort {
    public static void bubbleSort(int arr[],int n,int count) {
        boolean s=false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i ; j++) {
                if (arr[j] <arr[j - 1]) {
                    //BASIC.count++;
                    int temp = arr[j-1];
                    arr[j-1] = arr[j ];
                    arr[j] = temp;
                    s=true;
                }
            }
            if(!s)
            {
                break;
            }

        }
    }
            public static void main(String args[])
            {
                Scanner s=new Scanner(System.in);
                int t= s.nextInt();
                while (t-->0){
                    int n= s.nextInt();
                    int []arr=new int[n];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i]= s.nextInt();
                    }
                    int count =0;
                    bubbleSort(arr,n,count);
                }

            }
}

