package normal;

import java.util.ArrayList;
import java.util.Arrays;

class intersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i=0,n;
        int j=0;
        int k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> d=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1.length>nums2.length){
                if(nums1[i]==nums2[j]){
                    n=nums1[i];
                    d.add(n);
                    i++;
                }
                j++;
            }
            else{
                if(nums1[i]==nums2[j]){
                    d.add(nums1[i]);
                    j++;

                }
                i++;
            }
        }
        if(nums1.length> nums2.length){
            for(i=0;i<nums2.length;i++){
                nums2[i]=d.get(i);
                return nums2;
            }}
        else {
            for( int l=0;l<nums1.length;l++){
                nums1[l]=d.get(l);
            }
            return nums1;
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5} ,new int[]{9,4,9,8,4} )));;
    }
}
