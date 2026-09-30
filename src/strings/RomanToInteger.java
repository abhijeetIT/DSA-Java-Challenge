package strings;

//https://leetcode.com/problems/roman-to-integer/description/?envType=problem-list-v2&envId=string

import javax.naming.PartialResultException;
import java.util.HashMap;

public class RomanToInteger {

    public static Integer convert(String roman){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        Integer result=0;
        for (int i=0; i < roman.length(); i++){
            Integer value = map.get(roman.charAt(i));

            if (i+1 < roman.length() && value < map.get(roman.charAt(i+1)) ){
                result -=value;
            }else{
                result += value;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("III = "+convert("III"));
        System.out.println("XI = "+convert("XI"));
        System.out.println("IV = "+convert("IV"));
        System.out.println("VI = "+convert("VI"));
    }
}
