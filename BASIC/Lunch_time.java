package BASIC;

import java.util.Scanner;

public class Lunch_time{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            if (x >= 1 && x <= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
