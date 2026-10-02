package arrays;


import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOf2Array {

    public static int[] intersection(int[] nums1, int[] nums2) {

        return new int[]{1,2};
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
