package arrays.ShortingAlgorithms;

import java.util.Arrays;

//sorted array one element at a time

//Worst case is O(n2)
//best case is O(n)
//best if array is partially sorted

public class InsertionSort {

    public static int[] sort(int[] arr){
       for (int i=1;i<arr.length;i++){
           int key=arr[i];
           int j = i -1;

           while ((j >= 0) && (arr[j]>key)){
               arr[j+1]=arr[j];
               j--;
           }
                   arr[j+1]=key;
       }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,32,1,2,8,9};

        System.out.println(Arrays.toString(sort(arr)));
    }
}
