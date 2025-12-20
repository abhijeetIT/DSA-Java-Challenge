package arrays;

import java.util.Arrays;

/*
Question (Day 5 problem 1 essy) - https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=problem-list-v2&envId=array
 */
public class RemoveDublicate {

    static int removeDublicate(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int j=0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(j);
        return j+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,4,5,6,7,7,12,22,22};
        System.out.println(removeDublicate(nums));
    }
}
