package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Questions(Day 9 22-12-2025)-> https://leetcode.com/problems/3sum/description/

 */
public class Three3Sum {

    static List<List<Integer>> three3Sum(int[] nums) {

        //here is best approach
        if(nums.length < 3) return new ArrayList<>(); //if array not sufficient

        List<List<Integer>> returnValue = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; // skip duplicate 'i'

            int left = i+1, right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    returnValue.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates for left and right
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                } else if (sum < 0){
                    left++;
                } else {
                    right--;   // ✅ yahan fix
                }
            }
        }


//It's a brute force solution it wants more modifications
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++) {   // ✅ FIX
//                for (int k = j + 1; k < n; k++) {
//
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//
//                        List<Integer> triplet =
//                                Arrays.asList(nums[i], nums[j], nums[k]);
//
//                        triplet.sort(null); // duplicate avoid
//
//                        if (!returnValue.contains(triplet)) { // ✅ FIX
//                            returnValue.add(triplet);         // ✅ FIX
//                        }
//                    }
//                }
//            }
//        }
        return returnValue;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(three3Sum(nums));
    }
}