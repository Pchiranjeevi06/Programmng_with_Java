package CLG.vjudge_paramid;
import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for (int i = 0; i <T; i++) {
            int n = sc.nextInt();
            long []arr= new long[n];
            int sum=0;
        for (int j= 0; j <n ; j++) {
            arr[j]= sc.nextLong();
            sum+=arr[j];
        }
            System.out.println(sum);
        }

    }
}
