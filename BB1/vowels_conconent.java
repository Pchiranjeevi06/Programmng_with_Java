package BB1;

public class vowels_conconent {
    public static void main(String[] args) {
        countVowelsAndConsonants("[");
    }
    static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        str = str.toLowerCase(); // Convert to lowercase for case insensitivity
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".contains(String.valueOf(c))) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

}
