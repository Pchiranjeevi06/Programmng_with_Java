package STRINGS;

import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ch= sc.nextLine();
        int i=0;
        boolean K=true;
        char l;
        while(i<ch.length()){
            l=ch.toLowerCase().charAt(i);
            if(l!='a' && l != 'e' &&  l != 'i' && l!='o' && l!='u'){
                K= false;
                break;
            }

                i++;
        }
        if(K){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
