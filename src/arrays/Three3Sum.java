package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Questions(Day 9 22-12-2025)-> https://leetcode.com/problems/3sum/description/

 */
public class Three3Sum {

    static List<List<Integer>> three3Sum(int[] nums) {

//Its a brute force solution it wants more modifications
        List<List<Integer>> returnValue = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {   // ✅ FIX
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplet =
                                Arrays.asList(nums[i], nums[j], nums[k]);

                        triplet.sort(null); // duplicate avoid

                        if (!returnValue.contains(triplet)) { // ✅ FIX
                            returnValue.add(triplet);         // ✅ FIX
                        }
                    }
                }
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(three3Sum(nums));
    }
}