package BB1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Anagram {
    //----------------Direct Method-------------
    public static boolean areAnagrams(String a, String b) {
        // Check if the lengths of the strings are different
        if (a.length() != b.length()) {
            return false;
        }

        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";

        if (areAnagrams(a, b)) {
            System.out.println("YES, They are Anagram");
        } else {
            System.out.println("NO, They are not Anagram");
        }
    }
    //---------------using IndexOf() {if it is not found returns -1}----------
    public static boolean checkAnagram(String first, String second) {
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0 ? true : false;
    }
    //using collections---------Hash_map------------
        public static boolean isAnagram(String a, String b)
        {
            if (a.length() != b.length()) {
                return false;
            }
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < a.length(); i++) {
                if (map.containsKey(a.charAt(i))) {
                    map.put(a.charAt(i),map.get(a.charAt(i)) + 1);
                }
                else {
                    map.put(a.charAt(i), 1);
                }
            }
            for (int i = 0; i < b.length(); i++) {
                if (map.containsKey(b.charAt(i))) {
                    map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
                }
                else {
                    return false;
                }
            }
            Set<Character> keys = map.keySet();
            for (Character key : keys) {
                if (map.get(key) != 0) {
                    return false;
                }
            }
            return true;
        }



}


