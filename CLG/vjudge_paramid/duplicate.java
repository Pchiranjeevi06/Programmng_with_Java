package CLG.vjudge_paramid;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        HashSet<Long> lo= new HashSet<Long>();
        long []arr= new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextLong();
        }
//        for (int i = 0; i < n-1; i++) {
//            for (int j = i+1; j < n; j++) {
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                    break;
//
//                }
//            }
//
//        }
        for (int i = 0; i <n; i++) {
            long num= arr[i];
            if (lo.contains(num)) {
                lo.remove(num);
            }
            else{
            lo.add(num);}
        }
        long []ar1=new long[lo.size()];
        for (int i=0;i<lo.size();i++) {
            ar1[i]= (long) lo.toArray()[i];
        };
        Arrays.sort(ar1);
        for (long i : ar1) {
            System.out.print(i+" ");
        }
    }
}
