package normal;


import java.util.Scanner;
public class fabinacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  n;
        int a = 0;
        int b = 1;
        System.out.println("Enter the nth value: ");
        n = sc.nextInt();
        System.out.println("Fibonacci series: ");
        for (int sum = 0; sum <5; sum=a+b) {

            System.out.print(sum + " ");
            a = b;  // swap elements
            b = sum;
            // next term is the sum of the last two terms
        }
    }
}

