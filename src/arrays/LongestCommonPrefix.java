package arrays;

import java.util.Arrays;

//Day 2 problem essy 2 solving (15-12-2025)
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings){
          if(strings == null || strings.length == 0){
              return "";
          }
          String first = strings[0];

          for(int i = 0 ; i < first.length() ; i++){
              char ch = first.charAt(i);

              for (int j = 1 ; j < strings.length ; j++){
                  // remember to add >= equal after greater than , it occurs wrong output
                  if( i >= strings[j].length() || strings[j].charAt(i) != ch){
                      return first.substring(0,i);
                  }
              }
          }
          return first;
    }

    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }
}
