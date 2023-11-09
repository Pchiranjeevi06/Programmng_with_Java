package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class LCM_GCD {
    public static int lcm(int a, int b){
       return (a*b)/gcd(a,b);
    }
    public static int gcd(int a,int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        while(true){
            int num=sc.nextInt();
            if (num==0){
                break;
            }
            arr.add(num);
        }
        int lcm = arr.get(0);
        int gcd =arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            lcm = lcm(lcm, arr.get(i));
            gcd =gcd(gcd,arr.get(i));
        }
        System.out.printf("The LCM of %s is %d.", Arrays.toString(new ArrayList[]{arr}), lcm);
        System.out.println();
        System.out.printf("The LCM of %s is %d.", Arrays.toString(new ArrayList[]{arr}), gcd);

    }
}


