package normal;
import java.util.Scanner;
/*public class profit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        int res=0,k ;
        for (int i = 0,j=i+1;i< arr.length-1;) {
            int profit=arr[i],b= arr[j];
            if(profit<b)
            {
                for (int l = j+1; l < arr.length ;) {
                    if(b<(max=arr[l])){
                        b=max;
                        l++;
                    }
                    else {
                    break;}
                }
                res+=(b-profit);
            }

            i=i+2;j=j+2;
        }
        System.out.println(res);
    }
}*/
// You are using Java
class profit {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(profit(arr));

    }
    public static int profit(int[] arr) {
        int sum=0;
        int i=0,k=i+1;
        for(;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
            int max=0,l=i;
            for(;k<arr.length;k++){
                if(max<=arr[k] ){
                    max=arr[k];
                    i=k;
                }
                else{
                    break;
                }
            }
            sum+=(max-arr[l]);
            if(k== arr.length){
               break;
            }

            }
        }
        return sum;
    }
}
