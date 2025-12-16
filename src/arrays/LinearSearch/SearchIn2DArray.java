package arrays.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static int[] searchIn2DArray(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for(int row=0 ; row<arr.length ; row++){
            for(int col=0 ; col < arr[row].length ; col++){ //focus on this line in condition .
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,22},
                {32,31,42,23},
                {90,23,1,3,2}
        };
        int target = 31;

        System.out.println(Arrays.toString(searchIn2DArray(arr,target)));
    }
}
