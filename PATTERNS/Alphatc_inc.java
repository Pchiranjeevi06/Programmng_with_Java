package PATTERNS;

import java.util.Scanner;

public class Alphatc_inc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ptr(n);
        ptr2(n);
    }
    public static void ptr(int n) {
        for (int i = 0; i < n; i++) {
            char c = (char) ('A'+n-i-1);
            for (int j = 0; j <n-i; j++) {
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
        }
        /* user_input : 5
           out    E D C B A
                  D C B A
                  C B A
                  B A
                  A          */
    }
    public static void ptr2(int n){
        for (int i = 0; i < n; i++) {
            char c = (char) ('A'+n-i-1);
            for (int j = 0; j <=i; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
        /* user_input : 5
           out  E
                D E
                C D E
                B C D E
                A B C D E        */
    }


}
