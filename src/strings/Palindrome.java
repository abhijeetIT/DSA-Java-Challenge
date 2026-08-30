package strings;

import java.util.Scanner;

public class Palindrome {

    public static Boolean PalindromeOrNot(String str){
        int start=0;
        int end=str.length()-1;

        while(start <= end){
            if(!(str.charAt(start) == str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter str: ");
        String str = scanner.next();

       if(PalindromeOrNot(str.toLowerCase())){
           System.out.println("It's Palindrome");
        }else{
           System.out.println("Not a palindrome");
       }
    }
}
