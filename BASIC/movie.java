package BASIC;


import java.util.Scanner;
public class movie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        int b = sc.nextInt();
        if (b%2 == 0 && t>b) {
            System.out.println(t-b+b/2);
        }

    }
}

