package BB1;

public class reverseStrng {
    public static void main(String[] args) {

    }
    public static String reverselogic(String str) {

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        return reverseStr;

    }
    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}
