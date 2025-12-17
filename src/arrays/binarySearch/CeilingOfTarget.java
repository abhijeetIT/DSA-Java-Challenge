package arrays.binarySearch;

/*
Ceiling of a number:
Smallest element in the array which is >= target
If not found, return -1
Array must be SORTED
*/

public class CeilingOfTarget {

    static int ceilingOfTarget(int[] arr, int target) {

        // Edge case: empty array
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        // Binary Search
        while (start <= end) {

            // Safe mid-calculation (no overflow)
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];   // exact match is the ceiling
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        // After loop, start is the ceiling index (if it exists)
        if (start < arr.length) {
            return arr[start];   //start always point to the next biggest element of
        }
        // Ceiling does not exist
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 6, 7, 8};

        System.out.println(ceilingOfTarget(nums, 4));  // 5
        System.out.println(ceilingOfTarget(nums, 8));  // 8
        System.out.println(ceilingOfTarget(nums, 9));  // -1
    }
}
