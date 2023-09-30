package RECURSION;

public class subsets {
    public static void main(String[] args) {
       System.out.println(str("", "BASIC.abc"));
    }
// print with,without ,
    static String str(String o, String inp) {
        if (inp.isEmpty()){

            return o;
        }
        char ch= inp.charAt(0);
        String k= inp.substring(1);
        String l=str(o+ch,k);
        String r= str(o+(ch+0),k);
        String u=str(o,k);

        return l+"\n"+r+"\n"+u;
    }


}
