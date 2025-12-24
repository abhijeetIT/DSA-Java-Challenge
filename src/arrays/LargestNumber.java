package arrays;

import java.util.Arrays;

/*
Questions(Day 11 24-12-2025)-> https://leetcode.com/problems/largest-number/description/?envType=problem-list-v2&envId=array
 */
public class LargestNumber {
    static String largestNumber(int[] nums){
         if(nums.length == 0) return "0";

         //Step 1: Convert into a string
         String[] arr = new String[nums.length];
         for(int i=0; i <nums.length ; i++){
             arr[i] = String.valueOf(nums[i]);
         }

        // Step 2: Custom sorting
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        //Step 3 : handle edge case
         if(arr[0].equals("0")) return "0";

         //step 4: build result
         StringBuilder result = new StringBuilder();
         for(String s : arr){
             result.append(s);
         }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums = {10,2};
//        int[] nums = {3,30,34,5,9};

        System.out.println(largestNumber(nums));
    }
}
