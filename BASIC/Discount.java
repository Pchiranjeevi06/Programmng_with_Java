package BASIC;


import java.util.Scanner;

public class Discount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int c = scanner.nextInt();
            System.out.println(100-c);
        }
    }

}
