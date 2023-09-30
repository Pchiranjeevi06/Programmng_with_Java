package normal;

import java.util.Scanner;

public class bodmas {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a= s.next();
        int k=0;

        for (int j = 1; j <a.length(); j++) {

            for (int i = 1; i < a.length(); i += 2) {
                int n1 = a.charAt(i - 1)-'0';
                int n2 = a.charAt(i + 1)-'0';

                switch (a.charAt(i)) {
                    case '/':
                        k=n1/n2;
                        break;
                    case '*':
                        k += n1 * n2;
                        break;
                    case '+':
                        k += n1 + n2;
                        break;
                    case '-':
                        k += n1 - n2;
                        break;


                }
            }
        }



            }

}
