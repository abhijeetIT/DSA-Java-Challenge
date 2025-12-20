package arrays.LinearSearch;

/*
Questions( Day 7 (20-12-2025) - https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array
 */
public class SIngleNumber {

        public static int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;  // XOR cancels out duplicates
            }
            return result;
        }

    public static void main(String[] args) {
       int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));

    }
}
