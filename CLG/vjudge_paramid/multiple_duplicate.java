package CLG.vjudge_paramid;

import java.util.*;

public class multiple_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i <T; i++) {
            int n= sc.nextInt();
            int []arr= new int[n];
            List<Long> lo= new LinkedList<>();
            HashSet<Long> l1= new HashSet<>();
            for (int j= 0; j <n; j++) {
                arr[j]=sc.nextInt();
                long num = arr[j];
                if (lo.contains(num)) {
                    l1.add(num);
                }
                lo.add(num);
            }
            List<Long> l11=new LinkedList<>(l1);
            Collections.sort(l11);
            for (long j :l1) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        }
}
