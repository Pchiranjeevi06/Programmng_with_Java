package CLG.vjudge_paramid;

import java.util.Scanner;

public class sparse_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int [][]arr= new int[n][m];
        int countod=0,countev=0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==0){
                    countod++;
                }
                countev++;

            }
        }
        System.out.println(check(countev,countod,n,m)?"Yes":"No");
    }
    public static boolean check(int c1,int c2,int n, int m){
        return c2>c1/2 || c2>0.5*n*m;
    }
}
