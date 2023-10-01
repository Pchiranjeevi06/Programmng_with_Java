package PATTERNS.Alpahtaic;
import java.util.Scanner;
public class Alpha_Hill_Pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            char c='A';
            int l=2*i+1;
            for (int j = 1; j <=l; j++) {
                System.out.print(c);
                if(l/2>=j) c++;
                else c--;
            }
            System.out.println();
        }
        /*Input :  5
            out :   A
                  A B A
                 A B C B A
                A B C D C B A
               A B C D E D C B A    */
    }
}
