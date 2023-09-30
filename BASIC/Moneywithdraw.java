package BASIC;

import java.util.Scanner;

public class Moneywithdraw{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (c>t && t%5==0 && t>0) {
                System.out.printf("%.2f",c-(t+0.5));
        }
        else {
            System.out.printf("%.2f",c);

        }
    }
}