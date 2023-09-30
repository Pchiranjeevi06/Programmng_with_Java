package PATTERNS;

import java.util.Scanner;

class pascaltraiangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            int c=1;
            for (int j =0; j <i+1; j++) {
                System.out.print(c+" ");
                c=c*(i-j)/(j+1);

            }
            System.out.println();
        }
    }
}
