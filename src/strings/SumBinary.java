package strings;

//LeetCode Question -> https://leetcode.com/problems/add-binary/?envType=problem-list-v2&envId=string
public class SumBinary {

    public static String binarySum(String A, String B) {
        if (A.isEmpty() && B.isEmpty()) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        int carry = 0;

        int i = A.length() - 1;
        int j = B.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum +=A.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += B.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();


    }

    public static void main(String[] args) {
        System.out.println("Sum is : "+binarySum("110", "1"));
    }
}
