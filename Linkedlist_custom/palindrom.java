package Linkedlist_custom;

import java.util.LinkedList;

public class palindrom {
    public static void main(String[] args) {
        LinkedList<Integer> s=new LinkedList<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(30);
        s.add(20);
        s.add(10);
        boolean k =true;
        int i=0,j= s.size()-1,mid=(j+1)/2;
        while(i<=mid || j>mid){
            if(s.get(i)!=s.get(j)){
                k=false;
                break;
            }
            i++;
            j--;
        }
        if (k){
            System.out.println("okk");
        }
        else {
            System.out.println("no");
        }
    }
}
