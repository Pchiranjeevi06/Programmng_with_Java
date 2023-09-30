package RECURSION;

import java.util.LinkedList;

class array_list_subsets {

    public static void main(String[] args) {
        System.out.println(subseqRet("", "BASIC.abc", new LinkedList<>()));
    }
    static LinkedList<String> subseqRet(String p, String up, LinkedList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        subseqRet(p + ch, up.substring(1), list);
        subseqRet(p, up.substring(1), list);
        return list;
    }
}
