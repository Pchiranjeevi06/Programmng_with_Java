package CLG;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long sum=0;
        while(n!=0) {
            long r = n%10;
            sum = sum*10+r;
            n/=10;
        }

        System.out.println(sum);
    }

}
