package CLG;

import java.lang.reflect.Array;
import java.util.Arrays;

public class count_duplicate {
    public static void main(String[] args) {
        int []r= new int[100];
        int []arr= new int[]{1,2,2,1,4};
        int count=0;
        for (int i = 0; i < arr.length; i++) {

            r[i]= arr[i]++;


        }
        System.out.println(Arrays.toString(r));
        for (int i = 0; i < r.length; i++) {
            if(r[i]==1){
                count++;
            }
        }
        System.out.println(count);

    }
}
