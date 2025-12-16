package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Quetion (day 3 (16-12-2025))-> https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array
 */
public class PlusOne {
        static int[] plusOne(int[] digits) {
            if(digits.length == 0){
                return new int[]{0,0};
            }
            for(int i= digits.length-1 ; i > 0+1 ; i--){

                //if less than 9 then return
                if(digits[i] < 9){
                    digits[i]++;
                    return digits;
            }
                // if digit == 9, make it 0 and continue (carry)->  like 1239 in this situation it iteration become 1230 then adding 1 in if loop become 1240;
                digits[i] = 0;
            }
            //here the all value 999 +1 = 10000
            int[] result = new int[digits.length+1];
            result[0]=1; //we only add 1 to the first after all by default 0
            return result;
        }

    public static void main(String[] args) {
        int[] digits = {4,3,2,1};

        System.out.println(Arrays.toString(plusOne(digits)));
       ;
    }
}
