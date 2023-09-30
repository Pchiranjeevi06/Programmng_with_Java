package BB1;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        String s = "hello";
        String output=findRepeatedChars(s);
      /* printDuplicates(s);*/
        System.out.println(output);
    }

    // Duplicate elements and character BASIC.count
    public static String findRepeatedChars(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (charCount.get(c) > 1) {
                result.append(charCount.get(c));
                charCount.put(c, 0);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }


    //print only duplicate elements
    static void printDuplicates(String str) {
        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!seen.add(c)) {
                System.out.print(c + " ");
            }
        }
    }
    public static void findDuplicates(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i);
            }
        }
    }

}
