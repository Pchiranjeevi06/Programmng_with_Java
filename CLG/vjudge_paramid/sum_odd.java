package CLG.vjudge_paramid;

import java.util.Scanner;

public class sum_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long []arr= new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextLong();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2 != 0) {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
