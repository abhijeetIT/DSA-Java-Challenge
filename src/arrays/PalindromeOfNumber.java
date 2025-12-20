package arrays;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        int x = 101012;
        int copy = x;
        int reverse = 0;

        while(x != 0){
            int digit=x %10;
            reverse = reverse * 10 + digit;
            x/=10;
        }
        System.out.println(reverse);
    }

}
