package BASIC;

import java.util.Arrays;
import java.util.Scanner;

public class Missing1to100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        int []index= new int[10];
        for (int i = 1; i <10; i++) {

            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <=arr.length; i++) {
            index[arr[i]]++;
        }
        for (int i = 1; i <=index.length; i++) {
            if(index[i]!=1){
                System.out.println(i);
                break;
            }
        }
    }
}
