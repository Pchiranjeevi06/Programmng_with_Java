package PATTERNS;



import java.util.Scanner;

public class Number_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(n);
                }
//                else if {
//                    System.out.print(" ");
//                }
            }
            System.out.println();
        }
    }
}