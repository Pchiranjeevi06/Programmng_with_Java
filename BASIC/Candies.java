package BASIC;

import java.util.Scanner;
public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a - b;
            if (c > 0 && c % 4 == 0) {
                System.out.println(c / 4);
            } else if (c % 4 > 0) {
                System.out.println(c / 4 + 1);

            } else if (c % 4 != 0) {
                System.out.println(c);
            } else {
                System.out.println(0);
            }
        }
    }
}
