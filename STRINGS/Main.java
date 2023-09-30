package STRINGS;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.Scanner;
public class Main {
public static String getLongestRegex(String a, String b, String c) {
    int n = a.length();
    String regex = "";
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            for (int k = j + 1; k <= n; k++) {
                String r = a.substring(i, j + 1);
                if (r.contains("[") || r.contains("]") || r.contains("T")) {
                    continue;
                }
                if (r.length() != (new HashSet<Character>(r.chars().mapToObj(c1 -> (char) c1).collect(Collectors.toList()))).size()) {
                    continue;
                }
                if (b.contains(r) || c.contains(r)) {
                    continue;
                }
                for (int l = k; l <= n; l++) {
                    String s = a.substring(k, l);
                    if (s.contains("[") || s.contains("]") || s.contains("T")) {
                        continue;
                    }
                    if (s.length() != (new HashSet<Character>(s.chars().mapToObj(c1 -> (char) c1).collect(Collectors.toList()))).size()) {
                        continue;
                    }
                    if (b.contains(s) || c.contains(s)) {
                        continue;
                    }
                    String curr_regex = "[" + r + "]" + s;
                    if (regex.contains(curr_regex)) {
                        continue;
                    }
                    if (b.contains(curr_regex) || c.contains(curr_regex)) {
                        continue;
                    }
                    if (!a.contains(curr_regex) && !b.contains(curr_regex) && !c.contains(curr_regex)) {
                        if (curr_regex.length() > regex.length()) {
                            regex = curr_regex;
                        } else if (curr_regex.length() == regex.length() && curr_regex.compareTo(regex) < 0) {
                            regex = curr_regex;
                        }
                    }
                }
            }
        }
    }
    if (regex.equals("")) {
        return "-1";
    }
    return regex;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string a: ");
        String a = scanner.nextLine();
        System.out.print("Enter string b: ");
        String b = scanner.nextLine();
        System.out.print("Enter string c: ");
        String c = scanner.nextLine();
        String regex = getLongestRegex(a, b, c);
        System.out.printf("Longest regex that matches both %s and %s but not %s: %s%n", a, b, c, regex);
        String regexPart1 = regex.replaceAll("\\[[^\\]]*\\]", "[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        String regexPart2 = regex.replaceAll("\\[[^\\]]*\\]", "[ABDEFGHIJKLMNOPQRSTUVWXYZ] [ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        System.out.println(regexPart1);
        System.out.println(regexPart2);
    }



}