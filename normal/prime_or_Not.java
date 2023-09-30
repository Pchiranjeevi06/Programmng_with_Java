package normal;

import java.util.Scanner;

public class prime_or_Not {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int c=3;
        boolean b= n > 1;

        if(n%2==0 && n!=2 || n<=1){
            b=false;
        }
        while (c<Math.sqrt(n)){
            if (n%c==0){
                b=false;
                   break;
            }
            c+=2;

        }
        if(b){
            System.out.println("given number "+n+" is prime_or_Not");
        }
        else {
            System.out.println("given number "+n+" is not prime_or_Not");
        }
    }
}
