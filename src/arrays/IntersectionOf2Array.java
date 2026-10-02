package arrays;


import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOf2Array {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> intersection = new HashSet<>();
        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) {
                    intersection.add(j);
                }
            }
        }
        return intersection.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
