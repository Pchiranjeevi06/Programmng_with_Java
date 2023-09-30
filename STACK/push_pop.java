package STACK;

import java.util.Scanner;
import java.util.Stack;

public class push_pop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l= sc.nextInt();
        Stack<Integer> s =new Stack<>();
        for (int i = 0; i < l; i++) {
            String s1 = sc.next();
            int t= s1.charAt(1);
            
            String s2= String.valueOf(s1.charAt(0));
            if (s2.equals("push")) {
                s.push(t);
            }
            else if(s2.contains("pop")){
                s.add(s.pop());
            }
            if (s.isEmpty()) {
                System.out.println("Empty");
            }
            else{
            System.out.println(s.peek());}

        }


    }
}
