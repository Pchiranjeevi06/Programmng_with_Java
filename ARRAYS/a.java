package ARRAYS;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, n, s = 0;
        a = scanner.nextInt();
        n = scanner.nextInt();
        while (n <= 0) {
            n = scanner.nextInt();
        }
        while (n > 0) {
            s += a;
            a++;
            n--;
        }
        System.out.println(s);
    }
}
