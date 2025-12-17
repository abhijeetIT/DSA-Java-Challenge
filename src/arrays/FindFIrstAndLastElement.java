package arrays;

import java.util.Arrays;
/*
(day 4 (17-12-2025) -> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-numsay/description/
 */
public class FindFIrstAndLastElement {

    static  int search(int[] nums, int target, boolean wantFirstOccurance){
        int start=0,end= nums.length-1;

        int ans =0;

        while(start <= end){
            // Safe mid-calculation (no overflow)
            int mid = start + (end - start) / 2;

             if (target < nums[mid]) {
                end = mid - 1;
            }else if(target > nums[mid]) {
                start=mid+1;
             }else{
                ans=mid;    // potential answer has found
                 if(wantFirstOccurance){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    static  int[] findFIrstAndLastElement(int[] nums, int target){
             int[] ans = {-1,-1};
             ans[0] = search(nums,target,true);
             ans[1] = search(nums,target,false);

             return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(findFIrstAndLastElement(nums,target)));
    }
}
