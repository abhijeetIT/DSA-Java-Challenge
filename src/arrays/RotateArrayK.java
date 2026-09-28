package arrays;
//https://leetcode.com/problems/rotate-array/description/
public class RotateArrayK {

    public static void reverse(int[] nums,int start, int end){
        while(start < end){

            int temp = nums[start];
            nums[start]-=nums[end];
            nums[end]=start;

            start++;
            end++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};

        int k = 3;
        k=k%nums.length;

        reverse(nums);

    }
}
