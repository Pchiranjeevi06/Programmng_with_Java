package CLG.vjudge_paramid;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for (int j = 0; j < T; j++) {

        int n= sc.nextInt();
        HashSet<Long> lo= new HashSet<Long>();
        long []arr= new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextLong();
        }
        for (int i = 0; i <n; i++) {
            lo.add(arr[i]);
        }
       List<Long> sl=new ArrayList<>(lo);
        Collections.sort(sl);
        for (long i : sl) {
            System.out.print(i+" ");
        }
    }}
}
