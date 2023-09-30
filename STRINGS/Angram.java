package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class Angram{

    public static void main(String[] args){ Scanner sc=new Scanner(System.in);

        System.out.print("Enter first String: ");

        String first=sc.nextLine();

        System.out.print("Enter second String: ");

        String second=sc.nextLine();
        if(areStringsPerfectlyRelated (first, second)){

            System.out.println(first + "and "+ second + "are Related.");
        }
        else{ System.out.println(first + " and " + second +"are not Related.");

            }

        }

        private static boolean areStringsPerfectlyRelated(String str1, String str2) { if(str1.length() !=str2.length()){ return false;

        }

            char c[]=str2.toCharArray(); Arrays.sort(c);

            char c2[]=str1.toCharArray(); Arrays.sort(c2);

            for (int i=0;i<c.length;i++){

                if(c[i]!=c2[i]){ return false;

                }

            } return true;
    }
}


