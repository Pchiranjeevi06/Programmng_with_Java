package CLG;

public class print {
    public static void main(String[] args) {
        int a[][] = {{1,2,3}};
        int b[][] = {{5},{6},{7}};
        System.out.println(b.length);
        int c[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b[0].length; j++){
                for(int k = 0; k < b.length; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < c.length; i++){
            for(int j = 0; j < c[0].length; j++){
                System.out.println(c[i][j]);
            }
}

    }
}

