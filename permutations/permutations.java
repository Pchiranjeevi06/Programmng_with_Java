package permutations;

public class permutations {
    public static void main(String[] args) {
     per("","BASIC.abc");
    }
    static void per(String out,String inp){
        if (inp.isEmpty()){
            System.out.println((String)out);
            return;
        }
        int ch = inp.charAt(0);
        for (int i=0;i<=inp.length();i++){
            String s= out.substring(0,i);
            String k= out.substring(i, out.length());
            per(s+ch+k, inp.substring(1));
        }
    }
}
