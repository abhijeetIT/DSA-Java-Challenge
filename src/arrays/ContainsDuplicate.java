package arrays;

import java.util.HashSet;

/*
Question(Day 7 20-12-2025)-https://leetcode.com/problems/contains-duplicate/description/
 */
public class ContainsDuplicate {
    static  boolean containsDuplicate(int[] nums){
        HashSet<Integer> number = new HashSet<>();
        for(int i : nums){
            if(number.contains(i)){
                return true;
            }else number.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,4};

        System.out.println(containsDuplicate(nums));
    }
}
