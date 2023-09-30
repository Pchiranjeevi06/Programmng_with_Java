package STRINGS;

import java.util.Scanner;
public class numbersin_String {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ch= sc.nextLine();
        int i=0;
        boolean k=true;
        char l;
        while(i<ch.length()){
            l=ch.charAt(i);
            if(Character.isDigit(l)){
            k= true;
        }else {
                k=false;
                break;

            }
            i++;

    }
        if(k){
        System.out.println("Yes");
    }
        else {
        System.out.println("No");
    }
}
}

