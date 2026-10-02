package arrays;

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

import javax.naming.PartialResultException;

public class MaximumProductOf2Element {

    public static int maxProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i=0; i<nums.length ; i++){
            if (nums[i] > max1){
                max2=max1;
                max1=nums[i];
            }else if (nums[i] > max2 && nums[i] != max1){
                max2=nums[i];
            }
        }

        return (max1-1)*(max2-1);
    }

    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6,12,1,4,2};

        System.out.println(maxProduct(arr));
    }
}
