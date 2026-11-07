package strings;

// LeetCode question -> https://leetcode.com/problems/length-of-last-word/description/

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){

        if (s.isEmpty()){
            return -1;
        }
        int i = s.length()-1, length = 0;

        while(i >= 0 && s.charAt(i) == ' '){
            i++;
        }

        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i++;
        }
        return length;
    }


    public static void main(String[] args) {

        String s = "hii my name is abhijeet ";

        System.out.println(lengthOfLastWord(s));
    }
}
