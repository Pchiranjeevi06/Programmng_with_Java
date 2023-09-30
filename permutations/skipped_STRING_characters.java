package permutations;

public class skipped_STRING_characters {
    public static void main(String[] args) {
        System.out.println(skip("baccab"));
    }
    public static  String skip(String inp) {
        if (inp.isEmpty()) {
            return "";
        }
        char ch = inp.charAt(0);
        if (ch == 'a') {
            return skip(inp.substring(1));
        }else{
        return ch+skip(inp.substring(1));
        }

    }

}
