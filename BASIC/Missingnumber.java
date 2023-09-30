package BASIC;

import java.util.Scanner;

public class Missingnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for (int i = 1; i <100; i++) {

            sum+= sc.nextInt();
        }
        System.out.println(5050-sum);

    }
}
