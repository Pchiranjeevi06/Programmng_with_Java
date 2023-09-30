package BB1;

/*public class Nonvowels {
    public static void main(String[] args) {
       // vowels(new String[]{"BASIC.abc,e, dbc"}) ;
    }

}*/
public class Nonvowels {
    public static void main(String[] args) {
        String stringToCount = "Programming";
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char s : vowels.toCharArray()) {
            count += stringToCount.length() - stringToCount.replace(String.valueOf(s), "").length();
        }
        System.out.println(count);
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


