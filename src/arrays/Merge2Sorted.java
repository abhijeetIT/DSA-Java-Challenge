package arrays;

import java.util.Arrays;

public class Merge2Sorted {

    public static int[] merge(int[] arr1,int[] arr2){

        int[] mergeArray = new int[arr1.length+arr2.length];

        int acceding = 0;
        int descending = arr2.length-1;
        int k=0;

        while(acceding < arr1.length && descending >= 0){
            if (arr1[acceding] < arr2[descending]){
                mergeArray[k++]=arr1[acceding++];
            }else{
                mergeArray[k++]=arr2[descending--];
            }
        }

        //if arr1 remain element
        while(acceding < arr1.length){
            mergeArray[k++]=arr1[acceding++];
        }

        //if arr2 remain have remaining element
        while( descending >= 0){
            mergeArray[k++]=arr2[descending--];
        }
        return mergeArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,9};
        int[] arr2 = {12,11,10,8,7,6,3};

        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}
