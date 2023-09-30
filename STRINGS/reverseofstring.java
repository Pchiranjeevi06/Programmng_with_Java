package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class reverseofstring {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String ch= sc.next();
        for (int i = ch.length()-1; i >=0; i--) {
            System.out.print(ch.charAt(i));
        }
    }

}
