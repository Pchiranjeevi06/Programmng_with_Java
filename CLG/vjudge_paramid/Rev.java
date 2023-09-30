package CLG.vjudge_paramid;

import  java.util.Scanner;
public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long []arr= new long[n];
//        for (int i = 0; i <n; i++) {
//            arr[i]= sc.nextLong();
//        }
//        for (int i = 0; i < n/2; i++) {
//            long temp= arr[i];
//
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]= temp;
//        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <n; i++) {
            arr[i]= sc.nextLong();
        }
        for (int i =n-1; i >=0; i--) {
            System.out.println(arr[i]);
            }
    }
}
