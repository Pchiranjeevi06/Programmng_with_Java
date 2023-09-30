package ITERATION;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class intersection {
    public static String intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int []n3=new int[10];
        while(i<nums1.length && j<nums2.length){
            if(nums1.length>nums2.length){
                if(nums1[i]==nums2[j]){
                    n3[k]=nums1[i];
                    j++;
                    k++;
                }
                i++;}
            else{
                if(nums1[i]==nums2[j]){
                    n3[k]=nums1[i];
                    i++;
                    k++;
                }
                j++;

            }

        }

        return Arrays.toString(n3);
    }
    public static void main(String arg[]){
        int[]nums1={2,2,4,5,6,7,3,2};
        int []nums2={2,2,1,4,5,3,1};
        System.out.println(intersect(nums1,nums2));
    }
}
