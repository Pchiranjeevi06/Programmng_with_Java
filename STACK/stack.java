package STACK;

import java.util.HashSet;

public class stack {
    public static void main(String[] args) {
        HashSet N= new HashSet();
        N.add(100);
        N.add("sdni");
        for (int i = 0; i <N.size(); i++) {
            System.out.println(N.toArray()[i]);
        }
    }
}
