package arrays;
/*
 Quetion day 1 of 2026 (04-01-2026)-> https://leetcode.com/problems/third-maximum-number/?envType=problem-list-v2&envId=array
 */
public class ThirdMaximumNumber {
    static int thirdMaximumNumber(int[] nums){
        Integer max = null;
        Integer max2 = null;
        Integer max3 = null;

        for(Integer num : nums){
            if(num.equals(max) || num.equals(max2) || num.equals(max3)){
                continue;
            }
            if(max == null || max < num){
                max3 = max2;
                max2 = max;
                max = num;
            }else if(max2 == null || max2 < num){
                max3 = max2;
                max2 = num;
            }else if (max3 == null || max3 < num){
                max3 = num;
            }
        }

        return max3 == null ? max : max3;
    }

    public static void main(String[] args) {
        int[] nums = {5,5,1,2,2};
        System.out.println(thirdMaximumNumber(nums));
    }

}
