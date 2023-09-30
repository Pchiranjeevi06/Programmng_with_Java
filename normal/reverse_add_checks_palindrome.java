package normal;

public class reverse_add_checks_palindrome {
    public static void main(String[] args) {
        int a = 52;
        int k = palindrome(a);
        System.out.println(k);
    }
    public static int palindrome(int a) {
        String s = Integer.toString(a);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                a = a+ Integer.parseInt(new StringBuffer(s).reverse().toString());
                return palindrome(a);
            }
            i++;j--;
        }
        return a;
    }
}

