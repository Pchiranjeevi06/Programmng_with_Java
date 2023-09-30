package CLG;

import java.util.Scanner;

public class Palindrom_or_Not {
    public static void main(String[] args) {
        boolean k= true;
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        if (ispalstr(s,k)) {
            System.out.print("is a palindrom");
        }
        else {
            System.out.print("is no a palidrom");
        }
    }

    public static boolean ispalstr(String str,boolean k) {
        int i=0;
        int len=str.length();
        while(i<len-1){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                k=false;
                break;
            }
            else{
            i++;
            }
        }
        return k;
    }
}
