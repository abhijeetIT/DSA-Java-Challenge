package strings;

import java.util.Arrays;

public class SelectionSort {

    public static String[] sort(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[min].compareTo(arr[j]) > 0) {
                    min = j;
                }
            }

            String temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        String[] arr = {
                "kartik",
                "puja",
                "himanshu",
                "pritanshu",
                "abhijeet"
        };

        System.out.println(Arrays.toString(sort(arr)));
    }
}