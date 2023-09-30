package BASIC;

import java.util.Scanner;
public class sugarcrane{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int c = 50*a;
            System.out.println(c- (c*20/100+c*20/100+c*30/100));
        }
    }
}

