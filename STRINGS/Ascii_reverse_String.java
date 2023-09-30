package STRINGS;

import java.util.Scanner;

class Ascii_reverse_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String l = sc.next();
        String rev= reverseAsciiToString1(l);
        System.out.println(rev);
    }

    private static String reverseAsciiString(long l) {
        String c="";
        while ( l!=0){

            int rem=(int)(l%100);
            if((rem>=65 && rem<=90) || (rem>=97 && rem<=99) ||  rem ==32){
                 c+= String.valueOf((char)rem);
                l=l/100;
            }
            else{
                rem=(int)(l%1000);
                if(rem>=100 && rem<=122) {
                    c+= String.valueOf((char)rem);
                }
                l=l/1000;
            }
        }
        return c;
    }
    private static String reverseAsciiToString1(String input) {
            StringBuilder result = new StringBuilder();
            int k=input.length();
            for (int i =k-1;i>=0;) {
                // Extract two characters at a time (representing ASCII values)
                String asciiValueStr = input.substring(i-1, i+1);
                int rem = Integer.parseInt(asciiValueStr);
                if((rem>=65 && rem<=90) || (rem>=97 && rem<=99) ||  rem ==32){
                char character = (char)rem;
                result.append(character);
                i-=2;}
                else {

                     asciiValueStr = input.substring(i-2, i+1);
                    rem = Integer.parseInt(asciiValueStr);
                     if(rem>=100 && rem<=122) {
                    char character = (char)rem;
                    result.append(character);}
                    i-=3;
                }
            }
            return result.toString();
        }


}
