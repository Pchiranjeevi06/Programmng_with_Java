package ITERATION;

import java.util.ArrayList;
import java.util.List;

public class susets_iteration {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        List<List<Integer>> ans = sub(arr);
        for (List<Integer> list: ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> out = new ArrayList<>();
        out.add(new ArrayList<>());
        for (int num:arr ){
            int n= out.size();
            for (int i=0;i<n;i++){
                List<Integer> Internal = new ArrayList<>(out.get(i));
                Internal.add(num);
                out.add(Internal);
            }
        }
        return out;
    }
}
