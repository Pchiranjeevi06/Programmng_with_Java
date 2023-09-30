package CLG.vjudge_paramid;

import java.util.Scanner;

 class AllDiagonal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int i=0,j=n-1,ll=0;
            int b=0;
            while (b<n){
                int sum=0;
                int k=i,l=j-ll++;
                while(k<n && l<n){
                    sum+=arr[k][l];
                    k++;l++;
                }
                System.out.print(sum+" ");
                if(k==l || i>0){
                    ll=n-1;
                    ++i;
                    b++;
                }

            }
            System.out.println();
//            int i = n - 1, j = 0;
//            for (int k = 0; k < n; k++) {
//                int sum = 0;
//                int x = i, y = j;
//                while (x < n && y < n) {
//                    sum += arr[x++][y++];
//                }
//                System.out.print(sum + " ");
//                if (i > 0) {
//                    i--;
//                } else {
//                    j++;
//                }
//            }
        }
    }
}