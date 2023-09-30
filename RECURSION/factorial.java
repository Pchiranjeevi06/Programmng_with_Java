package RECURSION;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(fac(s.nextInt()));
    }

    private static int fac(int i) {
        if(i<=1){
            return 1;
        }
        return i*fac(i-1);
    }
}
