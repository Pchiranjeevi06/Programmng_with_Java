package RECURSION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class subset_with_duplication {
    public static void main(String[] args) {
        int[] arr ={1,2,2,2};
        List<List<Integer>> ans = sub(arr);
        for (List<Integer> list: ans){
            System.out.println(list);
        }

    }
    static List<List<Integer>> sub(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> out = new ArrayList<>();
        out.add(new ArrayList<>());
        int st=0;
        int end=0;
        for (int i=0;i<arr.length;i++){
            st=0;
            if(i>0 && arr[i]==arr[i-1]){
                st=end+1;
            }
            end= out.size()-1;
            int n= out.size();
            for (int j=st;j<n;j++){
                List<Integer> Internal = new ArrayList<>(out.get(j));
                Internal.add(arr[i]);
                out.add(Internal);
            }
        }
        return out;
    }
}
