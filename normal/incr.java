package normal;

public class incr {
    public static void main(String[] args) {
        int a=13;
        int b=a++ - --a + a++ + --a + ++a;
        System.out.println(a+" "+b);
    }
}
