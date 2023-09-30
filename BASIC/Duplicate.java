package BASIC;

import java.util.Arrays;
import java.util.Scanner;
class Duplicate{
    public static void main(String ar[]){
        Scanner b=new Scanner(System.in);
        int n1= b.nextInt();
        int n= b.nextInt();
        int [][]nums= new int[n1][n];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=b.nextInt();
            }
        } 
        for(int i=0;i<n1;i++){
            int sum =0;
            for(int j=0;j<n;j++){
                sum+=nums[i][j];
                }
            System.out.println(sum);
            }
        }
        
    }

