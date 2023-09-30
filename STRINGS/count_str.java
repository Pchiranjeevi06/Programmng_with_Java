package STRINGS;

public class count_str {
    public static void main(String[] args) {
        String a="aabbcc";
        String b;
        char sc[]= a.toCharArray();
        int l = sc.length;

        for (int i = 0; i < l-1; i++) {
            int cou=1;
            for (int j = i+1; j < l; j++) {
                if(a.charAt(i)==a.charAt(j)){
                    cou++;
                    i++;
                }
            }
//            if(cou>1){
//                sc= (a.charAt(i)+Integer.toString(cou)).toCharArray();
//                System.out.print(sc);
//            }
            if(cou>1){
                b= a.charAt(i)+Integer.toString(cou);
                System.out.print(b);
            }

        }
    }
}
