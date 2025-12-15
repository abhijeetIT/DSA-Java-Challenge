package arrays;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if( (nums[i]+nums[j]) == target){ //here is the main logic
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {

        //test case 1.
        /* int[]  nums = {2,7,11,15};
        int target = 9;   //expected output -> [0,1]
        */

        //test case 2.
        /* int[] nums = {3,2,4};
        int target = 6; // Output: [1,2]
        */
        //test case 2.
         int[] nums = {3,3};
         int target = 6; // Output: [0,1]

        System.out.println(Arrays.toString(twoSum(nums, target))); //here use to string to print the data
    }
}
