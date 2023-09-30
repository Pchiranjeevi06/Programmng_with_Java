package BASIC;

import java.util.Scanner;

public class traingleRule {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long a= sc.nextLong();
        long b= sc.nextLong();
        long c= sc.nextLong();

        if(a+b>c && b+c>a && c+a>b & a>0 && b>0 && c>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
