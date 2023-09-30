package Set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ch = s.nextLine().toUpperCase();
        boolean k= true;
        if(iscontains(ch,k)){
            System.out.println("panagram");
        }
        else {
            System.out.println("Not a panagram");
        }
    }

    public static boolean iscontains(String ch,boolean k) {
        HashMap<Character,Integer> m= new HashMap<>();
        for (int i = 65; i <=90; i++) {
            m.put((char)i,0);
        }
        int c=0;
        for (int i = 0; i <ch.length(); i++) {
            if(m.containsKey(ch.charAt(i))){
            m.put(ch.charAt(i),  m.get(c)+1);
            }
        }
        for(Integer value: m.values()){
            if (value == 0 && !m.containsKey(null)) {
                k=false;
                break;
            }
        }

        return k;
    }
}
