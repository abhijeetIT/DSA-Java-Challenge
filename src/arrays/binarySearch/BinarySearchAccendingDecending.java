package arrays.binarySearch;

public class BinarySearchAccendingDecending {
    static int binarySearchAccendingDecending(int[] nums,int target){
        int start =0 , end = nums.length-1 , mid = 0;

        boolean isAccending = nums[start] < nums[end];
        while(start <= end){
            mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(isAccending){
                if(target < nums[mid]){
                    end=mid-1;
                }else {
                    start =mid+1;
                }
            }else{
                if(target > nums[mid]){
                    end=mid-1;
                }else {
                    start =mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,8,10,12,13,15,16,19,20,33,44,55,66,210};
        System.out.println(binarySearchAccendingDecending(nums,12));

        int[] nums2 = {122,99,88,77,66,65,44,33,22,11,9,8,7,6,5,3,2,1};
        System.out.println(binarySearchAccendingDecending(nums2,44));
    }
}
