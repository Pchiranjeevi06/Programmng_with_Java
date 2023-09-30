package BASIC;

import java.util.Scanner;

class leapyear
{
 public static void main(String args[])
 {
     int year;
     System.out.println("Enter a with 4digits:");

     year = 2000;
     int co=0;
     while (year>0) {
         if (year % 4 == 0 || year%400==0) {
             System.out.println(year + " is leayyear");

             ++co;
             if (co == 10) {
                 break;
             }
         }
         ++year;

     }
    
}}