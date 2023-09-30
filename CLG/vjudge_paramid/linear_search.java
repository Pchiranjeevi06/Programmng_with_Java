package CLG.vjudge_paramid;

import java.util.HashSet;
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long key = sc.nextLong();
        long []arr= new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextLong();
        }
        System.out.println(lin(arr,key,n));
    }

    private static int lin(long[] arr, long key,int n) {
        int i;
        for (i = 0; i < n; i++) {
            if(arr[i]!=key && i== arr.length-1){
                return -1;
            }
            if (arr[i] == key) {
                break;
            }

        }
        return i;
    }
}
