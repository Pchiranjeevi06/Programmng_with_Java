package RECURSION;

import java.util.ArrayList;

public class create_arraylist_in_subsets {

    public static void main(String[] args) {
        System.out.println(subseqRet("","BASIC.abc"));
    }
    static ArrayList<String> subseqRet(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();

            list.add(p);

            return list;

        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet (p + ch, up.substring(1));

        ArrayList<String> right = subseqRet (p, up.substring(1));

        left.addAll(right);

        return left;}}
