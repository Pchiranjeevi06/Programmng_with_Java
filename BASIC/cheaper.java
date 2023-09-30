package BASIC;

import java.util.Scanner;
public class cheaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b= scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a-c < b-d) {
                System.out.println("First");
            }
            else if(a-c > b-d) {
                System.out.println("Second");
            }
            else{
                System.out.println("Any");
            }
        }
    }
}
