package STRINGS;

import java.util.Scanner;

public class ch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String L=s.nextLine();
        String c[]=L.split(" ");
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]+" ");
        }
    }
}
