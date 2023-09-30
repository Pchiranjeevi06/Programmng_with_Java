package STRINGS;
import java.util.Scanner;
public class stringbuildercount {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        String L= b.next().toLowerCase();
        StringBuffer sc=new StringBuffer(L);
        int count=0;
        String k;
        for (int i= 0; i< L.length();i++) {
             k= String.valueOf(L.charAt(i));
            if (k=="a"|| k=="e"||k=="i"|| k=="o"||k=="u") {
                count++;
            }

        }
        System.out.println(L.length()-count+" "+count);

    }
}
