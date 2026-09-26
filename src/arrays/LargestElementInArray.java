package arrays;

public class LargestElementInArray {

    public static int findLargestNumber(int[] arr){
        int max=arr[0];

        for (int i=1;i< arr.length;i++ ){
            if (max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,423,3,1,24,35,21,4543,134,5,31,34,534,543};

        System.out.println(findLargestNumber(arr));

    }
}
