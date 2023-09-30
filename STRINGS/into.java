package STRINGS;
import java.util.Scanner;

public class into {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String l= sc.nextLine();
        fun(l);
    }
    public static void fun(String name){
        char ch[]= name.toCharArray();
        StringBuffer s= new StringBuffer();
        int k=0,i=0;
        char c= name.charAt(i);
        for (;i < name.length(); i++) {
            if (Character.isUpperCase(i)) {
                s.append(Character.toLowerCase(c));
            }
            if(c>=65 && c<=90){
               s.append("\n");
            }
        }

    }

}
