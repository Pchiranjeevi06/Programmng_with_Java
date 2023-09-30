package normal;
import java.util.ArrayList;
import java.util.Arrays;

class compare {
    public static String successfulPairs(long[] s, long[] p, long no) {
        for(int i=0;i<s.length;i++){
            ArrayList<Long> li=new ArrayList<>();
            for(int j=0;j<p.length;j++){
                li.add((long) (s[i]*p[j]));
            }
            long count = 0;
            for(int k = 0; k<li.size(); k++){
                if(li.get(k)>no){
                    count+=1;
                }
            }
            s[i]= count;


        }
        return Arrays.toString(s);
    }

    public static void main(String[] args) {
        System.out.println(successfulPairs(new long[]{56029,39759,11542,85170},new long[]{68460,91879,36597,48406},1651505078));
    }
}