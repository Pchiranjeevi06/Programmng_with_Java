package normal;

import java.util.Arrays;

public class reverse {
    public static String rev(int[] a, int st, int end){
        while(st<end){
            int tenp=a[st];
            a[st]=a[end];
            a[end]=tenp;
            st++;end--;}
        return Arrays.toString(a);
    }
    public static void main(String[] args) {
        int a[]= {2,8,3,4,5,6};
        System.out.println(rev(a,0,a.length-1));
    }
}
