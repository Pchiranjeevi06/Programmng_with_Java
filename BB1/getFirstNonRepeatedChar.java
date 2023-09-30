package BB1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class getFirstNonRepeatedChar {
    public static void main(String[] args) {
        String s="switches";
        System.out.println(getFirstNonRepeatedChar1(s));
    }

    public static char getFirstNonRepeatedChar1(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }
    public static char firstNonRepeatedCharacter2(String word) {
        HashMap<Character,Integer> scoreboard = new HashMap<>();
        // build table [char -> BASIC.count]
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1); }
            else { scoreboard.put(c, 1); }
        }
        // since HashMap doesn't maintain order, going through string again
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c; }
        }
        throw new RuntimeException("Undefined behaviour");
    }


}
