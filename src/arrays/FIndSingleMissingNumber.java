package arrays;

public class FIndSingleMissingNumber {

    public static int FindMissingNumber(int[] arr){

        int n = arr.length+1;

        int actualSum=n*(n+1)/2;

        int currentSum=0;

        for(int i : arr){
            currentSum+=i;
        }
        return actualSum-currentSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        System.out.println(FindMissingNumber(arr));
    }
}
