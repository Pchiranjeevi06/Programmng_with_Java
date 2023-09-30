package BASIC;

import java.util.Scanner;

public class low_batery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            if (a <=15 && a>0) {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
