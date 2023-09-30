package CLG.vjudge_paramid;

import java.util.Scanner;
class product_array_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0) {
            int pr=1;
            int n= sc.nextInt();
            for (int i = 0; i < n; i++) {
                pr*=sc.nextInt();
            }
            System.out.println(pr);
        }
    }
}

