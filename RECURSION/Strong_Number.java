package RECURSION;

import java.util.HashMap;
import java.util.Map;

public class Strong_Number {
    static int[] p=new int[11];
    public static void main(String[] args) {
        int n=145;
        use();
        System.out.println(fact1(n));
      //  System.out.println(check(n));

    }
    public static void use(){
        p[0]=p[1]=1;
        for (int i = 2; i <=10 ; i++) {
            p[i]=p[i-1]*i;
        }
    }
    private static boolean fact1(int k) {
    int n=k,s=0;
    while(k>0){
        s+=p[k%10];
        k/=10;
    }
    return n==s;}

    public static boolean check(int n){
        int sum=0;
        String s= Integer.toString(n);
        for (char c:s.toCharArray()) {
            int k=Character.getNumericValue(c);
            sum+=fact(k);
        }
    return sum==n;}

    private static int fact(int k) {

        if(k==0||k==1){
            return 1;
        }
        int res= k*fact(k-1);
       return res;
    }
}
