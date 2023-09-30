package BASIC;

import java.util.Scanner;

public class Hot_cold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int c = scanner.nextInt();
            if (c >= 20) {
                System.out.println("HOT");
            } else {
                System.out.println("COLD");
            }
        }
    }
}