package SORTING_ALGORITHMS;
import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int arr[]=new int[5];
        boolean w=false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int l=0,r=arr.length-1;
        System.out.println(binary_serch(arr,k,l,r));
    }
    private static int binary_serch(int []arr, int k, int l, int r){
        if(l<=r) {

            int mid = (l + r) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (k > arr[mid]) {
                return binary_serch(arr, k, mid + 1, r);
            } else if (k < arr[mid]) {
                return binary_serch(arr, k, l, mid - 1);
            }
        }
        return  -1;
    }
}
