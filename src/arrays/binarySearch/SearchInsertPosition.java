package arrays.binarySearch;

/*
Quetions(Day 7 20-12-2025)-> https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
 */
public class SearchInsertPosition {
    public static int searchInsertPosition(int[] nums, int target) {
           int start =0 , end = nums.length-1;

           //its same concept of celling of target
           while(start <= end){
               int mid = start+(end - start)/2;

               if(target == nums[mid])  return mid;
               else if(target > nums[mid]) start = mid +1;
               else end = mid -1;
           }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 4;

        System.out.println(searchInsertPosition(nums,target));
    }
}
