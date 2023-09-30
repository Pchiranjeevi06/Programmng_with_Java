package PATTERNS.Simple;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=8;
        for (int i = (n /2) ; i <n-1; i++) {
            for (int j =1; j <n-i; j++) {
                System.out.print("@");
            }
            System.out.println();
            }


    }
}
