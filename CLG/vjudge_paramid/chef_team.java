package CLG.vjudge_paramid;


import java.util.*;
import java.util.Scanner;
class chef_team{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        for (int i = 0; i <L; i++) {
            int N= sc.nextInt();
            int k=2;
            ArrayList<Integer> ar= new ArrayList<>();
            ar.add(1);
            ar.add(N);

            while ( k<=N/2){
                if (N%k ==0) {
                    ar.add(k);

                }
                k++;
            }
            int counteven=0,countodd=0;
            for (int l:ar) {
                if(l%2==0){
                    counteven++;
                }
                else {
                    countodd++;
                }
            }
            System.out.println(counteven==countodd?1:0);

        }

    }
}
