package CLG.vjudge_paramid;


import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int m= sc.nextInt();
        long [][]arr= new long[n][m];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();
        }


    }
}

