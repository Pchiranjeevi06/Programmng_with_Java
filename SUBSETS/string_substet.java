package SUBSETS;

import java.util.Arrays;
import java.util.Scanner;

public class string_substet{
    public static void main(String[] ars){
        Scanner s = new Scanner(System.in);
        String l=s.next();
        char[] m=l.toCharArray();
        char []c=l.toCharArray();
        Arrays.sort(c);
        int j=0;
        for (char d:c){
            int q=l.indexOf(d);
            StringBuilder f= new StringBuilder();
            for(int i=q;i<l.length();i++) {
                f.append(m[i]);
                System.out.println(f);
                j++;
            }
        }
        System.out.println(j);
    }
}
