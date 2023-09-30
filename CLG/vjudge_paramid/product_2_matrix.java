package CLG.vjudge_paramid;

import java.util.Scanner;

public class product_2_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N1 = sc.nextInt();
            int M1 = sc.nextInt();
            int[][] A = new int[N1][M1];
            for (int i = 0; i < N1; i++) {
                for (int j = 0; j < M1; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            int N2 = sc.nextInt();
            int M2 = sc.nextInt();
            int[][] B = new int[N2][M2];
            for (int i = 0; i < N2; i++) {
                for (int j = 0; j < M2; j++) {
                    B[i][j] = sc.nextInt();
                }
            }
            if (M1 != N2) {
                System.out.println("Incompatible dimensions");
                continue;
            }
            int[][] C = matrixMultiply(A, B);
            for (int i = 0; i < N1; i++) {
                for (int j = 0; j < M2; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] matrixMultiply(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int n2 = B.length;
        int p = B[0].length;
        if (n != n2) {
            throw new IllegalArgumentException("Incompatible dimensions");
        }
        int[][] C = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int dotProduct = 0;
                for (int k = 0; k < n; k++) {
                    dotProduct += A[i][k] * B[k][j];
                }
                C[i][j] = dotProduct;
            }
        }
        return C;
    }
}
