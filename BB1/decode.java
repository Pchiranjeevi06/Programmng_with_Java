package BB1;

import java.util.HashMap;
import java.util.Map;

public class decode {
    public static void main(String[] args) {
        String b="12343";
        HashMap<Character,Integer> j=new HashMap<>();
        for (char i:b.toCharArray()) {
            char k=b.charAt((char)(64+Integer.valueOf(String.valueOf(i))));
            if(b.contains(String.valueOf(i))){
                j.put(k,j.get(k)+1);
            }
            else{
                j.put(k,j.get(1));
            }
        }
        StringBuffer l=new StringBuffer();
        for (Map.Entry<Character, Integer> entry : j.entrySet()) {
            if(entry.getValue()==1){
                l.append(entry.getValue());
            }
        }
        int k=l.length();
        for (int i = 0; i < l.length()-1 ;i++) {
            for (int m = i+1; m <l.length() ; m++) {
                if( Integer.valueOf(l.substring(i,m))> 0 && Integer.valueOf(l.substring(i,m))<=(26)){
                    k+=1;
                }
            }
        }
        System.out.println(k);

     }
}
/*    public static void main(String[] args) {
        String s = "226"; // Change this to your input sequence
        int BASIC.count = numDecodings(s);
        System.out.println("Number of possible decodings: " + BASIC.count);

        if (BASIC.count > 0) {
            System.out.println("One of the valid decoded sequences: ");
            String decodedSequence = getOneDecoding(s);
            System.out.println(decodedSequence);
        }
    }

    public static int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int currentDigit = s.charAt(i - 1) - '0';
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));

            if (currentDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static String getOneDecoding(String s) {
        int n = s.length();
        StringBuilder decodedSequence = new StringBuilder();
        int i = n - 1;

        while (i >= 0) {
            int currentDigit = s.charAt(i) - '0';
            int twoDigit = (i > 0) ? Integer.parseInt(s.substring(i - 1, i + 1)) : 0;

            if (currentDigit >= 1 && currentDigit <= 9) {
                char decodedChar = (char) ('A' + currentDigit - 1);
                decodedSequence.insert(0, decodedChar);
                i--;
            } else if (twoDigit >= 10 && twoDigit <= 26) {
                char decodedChar = (char) ('A' + twoDigit - 1);
                decodedSequence.insert(0, decodedChar);
                i -= 2;
            } else {
                break;
            }
        }

        return decodedSequence.toString();
    }
}*//*


*/
