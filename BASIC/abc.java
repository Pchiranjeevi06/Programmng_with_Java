package BASIC;

public class abc {
    public static void main(String[] args) {
        int[] freq = new int[26];
        String str= "happy";
        System.out.println(str.charAt(0) - 'a');

        for (int i = 0; i < 5; i++) {
            freq[str.charAt(i) - 'a']++;

        }

        for (int i = 0; i < 5; i++) {
            // if updated value ==0 then not going to proceed
            if (freq[str.charAt(i) - 'a'] != 0) {
            System.out.print(str.charAt(i) + "-->");
            System.out.println(freq[str.charAt(i) - 'a']);

            // update to 0
            freq[str.charAt(i) - 'a'] = 0;}
        }
    }
}
