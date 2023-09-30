package CLG;

import java.util.Scanner;

public class nextround {
    static int round(int[] arr,int n,int score){
        int count = 0;
        int ithscore = arr[score - 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= ithscore && arr[i] > 0)
                count++;
            else
                break;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(round(arr,n,k));
    }
}
