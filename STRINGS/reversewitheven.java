package STRINGS;

import java.util.Scanner;

public class reversewitheven{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ch= sc.next();
//        for (int i = 1; i<=ch.length(); i++) {
//            if (i% 2 == 0) {
//                System.out.print(ch.charAt(i-1));
//            }
//        }
//        for (int i = 1; i<=ch.length(); i++){
//            if (i%2!=0){
//                System.out.print(ch.charAt(i-1));
//            }
//        }
        for (int i = 1; i<ch.length(); i+=2) {
                System.out.print(ch.charAt(i));

        }
        for (int i = 0; i<ch.length(); i+=2){
                System.out.print(ch.charAt(i));

        }
    }

}

