package STRINGS;


import java.util.Scanner;
public class count_vowels_conconents {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ch= sc.nextLine();
        int i=0;
        boolean k=true;
        char l;
        int c=0,c1=0;
        while(i<ch.length()){
            l=ch.toLowerCase().charAt(i);
            if(l!='a' && l != 'e' &&  l != 'i' && l!='o' && l!='u') {
                c++;
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


