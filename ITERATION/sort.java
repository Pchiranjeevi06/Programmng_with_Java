package ITERATION;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int arr[]=new int[10];
        boolean w=false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count++;
                if(count==2){
                    w= true;
                System.out.println(i);
                break;
                }
            }
        }
        if (w) {
            System.out.println("key is present");
        }
        else {
            System.out.println("Not present");
        }
    }
}
