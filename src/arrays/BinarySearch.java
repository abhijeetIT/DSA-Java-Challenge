package arrays;

//Day 2(15-12-2025) - Binary search
public class BinarySearch {
    static boolean flag = false;
    public static int binarySearch(int[] nums, int target){
           int low = 0, high = nums.length -1, mid = 0;

           while(low <= high){
               mid = (low+high)/2;
               if(target == nums[mid]){
                   return mid;
               }else if(target < nums[mid]){
                   high = mid - 1;
               }else{
                   low = mid +1;
               }
           }
          return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,8,10,12,13,15,16,19,20,33,44,55,66,210};
        int target = 10;

        System.out.println(binarySearch(nums,target)); //if it gives -1 so element not found
    }
}

/* Note.
1. The Binary search performed only sorted arrays.
 */
