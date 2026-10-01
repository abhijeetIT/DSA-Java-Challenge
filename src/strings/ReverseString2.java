package strings;

import java.util.Arrays;

// https://leetcode.com/problems/reverse-string-ii/?envType=problem-list-v2&envId=string
public class ReverseString2 {

    public static String reverse(String str,  int k){

        if (k > str.length()){
            System.out.println("Not possible");
             return null;
        }
        char[] charArray = str.toCharArray();

        int start =0;
        int end = k-1;
        while(start < end){

            char temp = charArray[start];
            charArray[start]=charArray[end];
            charArray[end]= temp;
            start++;
            end--;
        }

       return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(reverse("abhijeet",2));

        System.out.println(reverse("abcd",2));

        System.out.println(reverse("abhijeet",10));
    }
}
