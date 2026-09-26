package strings;

import java.util.Arrays;

public class Sort {


    public static String Sort(String str){

        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println("The Sorted array.");
        String str = "dcba";

        System.out.println(Sort(str));
    }
}
