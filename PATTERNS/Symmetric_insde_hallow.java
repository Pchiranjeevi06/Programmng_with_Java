package PATTERNS;


import java.util.Scanner;

class Symmetric_insde_hallow {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ptr(n);
    }
    static void ptr(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <2*(n-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }


    }
}