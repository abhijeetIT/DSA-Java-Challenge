package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//LeetCode Question 15 -> https://leetcode.com/problems/3sum/description/
public class ThreeSumProblem {

    public static HashSet<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3){
            return new HashSet<>();
        }

        HashSet<List<Integer>> returnValue = new HashSet<>();

        for (int i = 0 ; i < nums.length ; i++){
            for (int j = i+1 ; j < nums.length ; j++){
                for (int k = j+1 ; k < nums.length ; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if (sum == 0) {

                        List<Integer> triplet =
                                Arrays.asList(nums[i], nums[j], nums[k]);

                        triplet.sort(null);

                        returnValue.add(triplet);
                    }
                }
            }
        }

        return returnValue;
    }


    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }
}
