package STRINGS;

import java.util.Scanner;

public class charctercount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ch= sc.nextLine();
        char c= sc.next().charAt(0);
        int i=0;
        int co=0;
        while(i<ch.length()){
            if(ch.charAt(i)==c){
                co++;
            }
            i++;
        }
        System.out.println(co);
    }
}
