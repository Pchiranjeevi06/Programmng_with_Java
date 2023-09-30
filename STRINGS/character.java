package STRINGS;

import java.util.HashSet;
import java.util.Set;

class character {
//    public static boolean checkIfPangram(String sentence) {
//        Set<Character> alphabet = new HashSet<>();
//        if(sentence == null || sentence.length()<26){
//            return false;
//        }
//        for (char c : sentence.toCharArray()) {
//            alphabet.add(c);
//            if (alphabet.size() == 26) {
//                return true;
//            }
//
//        }
//
//        return false;
//    }
    public static boolean checkIfPangram1(String s1){
        char[] c=s1.toCharArray();
        int[] k=new int[26];
        for (char l:c) {
            ++k[(l - 'a')];
        }
        for (int i = 0; i < k.length; i++) {
            if (k[i]<=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram1("thequickbrownfoxjumpsovert"));
    }

}
