package normal;

public class leap {
    public static boolean isleap(int y) {
        return y%4==0 && (y%100!=0 || y%400==0);
    }
    public static void main(String[] args) {
        int y=2002;
        System.out.println(isleap(y));
    }


}
