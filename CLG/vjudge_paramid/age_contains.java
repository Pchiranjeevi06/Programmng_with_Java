package CLG.vjudge_paramid;
import java.util.ArrayList;
import java.util.Scanner;
public class age_contains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean k=true;
        int t= sc.nextInt();
        int t1 =2000;
        while (t-->0) {
            int n= sc.nextInt();
            int []arr= new int[n];
            ArrayList<Integer> li=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
                li.add(arr[i]);
                block(li,arr,t1,i,k);
            }
            if(k==true){
                System.out.println("Accepted");
            }
            else {
                System.out.println("Rejected");
            }

        }

    }
    public static boolean block(ArrayList<Integer> li, int[] arr, int t1,int i,boolean k){
        if (li.contains(t1 - arr[i])) {
            t1 -= arr[i];
            if (t1 == 0) {
                return k==true;
            }
        }
        return false;
    }
}
