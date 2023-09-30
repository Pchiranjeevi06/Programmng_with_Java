package Map;

import java.util.HashMap;

public class pnagram {
    public static void main(String[] args) {
        String s= "a bcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Boolean> b= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c)) {
                b.put(c, true);
            }
        }
        if(b.size()==26 ){
            System.out.println("Pnagram");
        }else {
            System.out.println("Not");
        }
    }
}
