package normal;

import java.util.Arrays;
import java.util.Scanner;

class Parser {
    static String input;
    static int i=0;
    static char[] lasthandle = new char[6];
    static char[] stack = new char[50];
    static String[] handles = {")E(","E*E","E+E","i","E^E"};
    //(E) becomes )E( when pushed to stack
/* 1.  E -> (E)
*  2.  E ->E+E
*  3.  E -> E+E
*  4.  E -> i
*  5.  E -> E^E
* */
    static int top=0,l;
    static char prec[][] = {

            /*input*/

            /*stack    +    -   *   /   ^   i   (   )   $  */

            /*  + */  {'>', '>','<','<','<','<','<','>','>',},

            /*  - */  {'>', '>','<','<','<','<','<','>','>',},

            /*  * */  {'>', '>','>','>','<','<','<','>','>',},

            /*  / */  {'>', '>','>','>','<','<','<','>','>',},

            /*  ^ */  {'>', '>','>','>','<','<','<','>','>',},

            /*  i */  {'>', '>','>','>','>','e','e','>','>',},

            /*  ( */  {'<', '<','<','<','<','<','<','>','e',},

            /*  ) */  {'>', '>','>','>','>','e','e','>','>',},

            /*  $ */  {'<', '<','<','<','<','<','<','<','>',},

    };

    static int getindex(char c) {
        switch(c) {
            case '+':return 0;
            case '-':return 1;
            case '*':return 2;
            case '/':return 3;
            case '^':return 4;
            case 'i':return 5;
            case '(':return 6;
            case ')':return 7;
            case '$':return 8;
        }
        return -1;
    }

    static void shift() {
        stack[++top]=input.charAt(i++);
        stack[top+1]='\0';
    }

    static int reduce() {
        int i,len,found,t;
        for(i=0;i<5;i++) { //selecting handles
            len=handles[i].length();
            if(stack[top]==handles[i].charAt(0) && top+1>=len) {
                found=1;
                for(t=0;t<len;t++) {
                    if(stack[top-t]!=handles[i].charAt(t)) {
                        found=0;
                        break;
                    }
                }
                if(found==1) {
                    stack[top-t+1]='E';
                    top=top-t+1;
                    lasthandle = handles[i].toCharArray();
                    stack[top+1]='\0';
                    return 1; //successful reduction
                }
            }
        }
        return 0;
    }

    static void dispstack() {
        for(int j=0;j<=top;j++)
            System.out.print(stack[j]);
    }

    static void dispinput() {
        for(int j=i;j<l;j++)
            System.out.print(input.charAt(j));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        input = new String();
        System.out.println("Enter the string: ");
        input = sc.next();
        input += "$";
        l = input.length();
        stack[0] = '$';
        System.out.println("\nSTACK\tINPUT\t\tACTION");
        while (i <= l) {
            shift();
            System.out.println();
            dispstack();
            System.out.print("\t");
            dispinput();
            System.out.print("\tShift");
            if (prec[getindex(stack[top])][getindex(input.charAt(i))] == '>') {
                while (reduce()>0) {
                    System.out.println();
                    dispstack();
                    System.out.print("\t");
                    dispinput();
                    System.out.print("\tReduced: E->" + Arrays.toString(lasthandle));

                }
            }
        }

        if (new String(stack).equals("$E$"))
            System.out.println("\nAccepted;");
        else
            System.out.println("\nNot Accepted;");
    }

}