package Linkedlist_custom;

import java.util.LinkedList;

public class folding {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> s=new LinkedList<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);

        int l= s.size()-1;
        int mid= (l+1)/2;
        int i=0,j=0;
        while(i<=mid){
            int v=s.removeLast();
            if(j>0){
                s.add(j+3,v);
            }
            else {
                s.add(j+1,v);
            }


            i++;

        }
        System.out.println(s);
    }
}
