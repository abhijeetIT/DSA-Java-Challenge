package strings;

import java.util.Arrays;

public class ReverseACharacterOfArray {

    static char[] reverse(char[] chars){

        if (chars.length == 0 ) return null;

        if (chars.length == 1) return chars;

        int start=0;
        int end= chars.length-1;
        while(start < end){
            char temp = chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }

        return chars;
    }


    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};

        System.out.println(Arrays.toString(reverse(chars)));
    }
}
