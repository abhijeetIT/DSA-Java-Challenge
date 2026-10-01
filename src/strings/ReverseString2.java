package strings;

import java.util.Arrays;

// https://leetcode.com/problems/reverse-string-ii/?envType=problem-list-v2&envId=string
public class ReverseString2 {

    public static String reverse(String s,  int k){

        char[] charArray = s.toCharArray();
        int n = charArray.length;

        // Jump 2k characters at a time
        for (int i = 0; i < n; i += 2 * k) {
            int start = i;
            // Reverse k characters, or whatever is left if it's less than k
            int end = Math.min(i + k - 1, n - 1);

            // Your excellent two-pointer swap logic
            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }

        return new String(charArray);

    }

    public static void main(String[] args) {
        System.out.println(reverse("abhijeet",2));

        System.out.println(reverse("abcd",2));

        System.out.println(reverse("abhijeet",10));
    }
}
