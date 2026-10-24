package arrays.ShortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int arr[], int startingIndex, int mid, int endingIndex){
        int[] sortedMergeArray = new int[endingIndex - startingIndex + 1];

        int index1 = startingIndex;
        int index2 = mid+1;
        int sortedMergeArrayPointer = 0;

        while (index1 <= mid && index2 <= endingIndex){
            if(arr[index1] < arr[index2]){
                sortedMergeArray[sortedMergeArrayPointer++] = arr[index1++];
            }else{
                sortedMergeArray[sortedMergeArrayPointer++] = arr[index2++];
            }
        }

        while(index1 <= mid){
            sortedMergeArray[sortedMergeArrayPointer++] = arr[index1++];
        }

        while (index2 <= endingIndex){
            sortedMergeArray[sortedMergeArrayPointer++] = arr[index2++];
        }

        for (int i = 0 , j = startingIndex; i < sortedMergeArray.length ; i++, j++){
            arr[j] = sortedMergeArray[i];
        }
    }


    public static void divide(int[] arr, int startingIndex, int endingIndex) {

        if (startingIndex >= endingIndex) {
            return;
        }

        int mid = startingIndex + (endingIndex - startingIndex) / 2;

        divide(arr, startingIndex, mid);
        divide(arr, mid + 1, endingIndex);

        merge(arr, startingIndex, mid, endingIndex);
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 10, 4, 5, 1, 9, 2};

        divide(arr,0,arr.length-1);

        System.out.println("After sort");
        System.out.println(Arrays.toString(arr));
    }
}
