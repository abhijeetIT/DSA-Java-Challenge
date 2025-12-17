package arrays.LinearSearch;

// Question - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberOfDigit {

    static int isOddEven(int n){
        if(n<0){
            n = n*-1;  //here is the twist for converting number to positive
        }
        return (int) Math.log10(n)+1;
    }
    public static int evenNumberOfDigit(int[] nums){
         if (nums.length == 0){
             return 0;
         }
         int count=0;
         for(int i = 0 ; i < nums.length ; i++){
             if(isOddEven(nums[i]) % 2 == 0){
                 count++;
             }
         }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {123,13,3131,312,2,78};
        System.out.println(evenNumberOfDigit(nums));
    }
}
