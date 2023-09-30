package ARRAYS;

import java.util.Arrays;

public class mergearray2 {

          public static String merge2_withdecresing_index(int[] nums1, int m, int[] nums2, int n) {

                int i=m-1; // will point at m-1 index of nums1 array
                int j=n-1; // will point at n-1 index of nums2 array
                int k=m+n-1; //will point at the last position of the nums1 array


                while(j>=0){
                    // If element at i index of nums1 > element at j index of nums2
                    // then it is largest among two arrays and will be stored at k position of nums1
                    // using i>=0 to make sure we have elements to compare in nums1 array
                    if(i>=0 && nums1[i]>nums2[j]){
                        nums1[k]=nums1[i];
                        k--;
                        i--; //updating pointer for further comparisons
                    }else{
                        // element at j index of nums2 array is greater than the element at i index of nums1 array
                        // or there is no element left to compare with the nums1 array
                        // and we just have to push the elements of nums2 array in the nums1 array.
                        nums1[k] = nums2[j];
                        k--;
                        j--; //updating pointer for further comparisons
                    }
                }
              return Arrays.toString(nums1);
            }
    public static String merge22(int[] nums1, int m, int[] nums2, int n) {

        int i=0; // will point at m-1 index of nums1 array
        int j=0; // will point at n-1 index of nums2 array
        int k=0; //will point at the last position of the nums1 array

        int []r=new int[m+n];
        while(j<n){
            // If element at i index of nums1 > element at j index of nums2
            // then it is largest among two arrays and will be stored at k position of nums1
            // using i>=0 to make sure we have elements to compare in nums1 array
            if(i<m && nums1[i]<nums2[j]){
                r[k]=nums1[i];

                i++;
                k++;//updating pointer for further comparisons
            }else{
                // element at j index of nums2 array is greater than the element at i index of nums1 array
                // or there is no element left to compare with the nums1 array
                // and we just have to push the elements of nums2 array in the nums1 array.
                r[k] = nums2[j];

                j++;
                k++;//updating pointer for further comparisons
            }
        }
        return Arrays.toString(r);
    }




        public static void main(String[] args) {
            int[] nums1={1,2,3,0,0,0};
            int  m=nums1.length;
            int[] nums2={2,5,6,32,3,4};
            int n=nums2.length;
            System.out.println(merge22(nums1,m,nums2,n));
            System.out.println(merge2_withdecresing_index(nums1,m,nums2,n));
        }



}
