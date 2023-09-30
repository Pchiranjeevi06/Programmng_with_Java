package BASIC;

import java.util.Scanner;

public class forienheat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        for (int i = 0; i <T; i++) {
            int x= sc.nextInt();
            if(x>98 ){
                System.out.println("YES");
            }
            else {
                System.out.println("N0");
            }
        }
    }
}
