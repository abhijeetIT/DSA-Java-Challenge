package arrays.binarySearch;
/*
(day 4 (17-12-2025) -> https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 */
public class CellingOfTargetInCharacter {
    static char cellingOfTargetInCharacter(char[] latters, char target){

           int start = 0, end = latters.length-1, mid =0;
           while(start <= end){
               mid = start+(end - start)/2;

               if(target < latters[mid]){
                   end = mid-1;
               }else{
                   start= mid +1;
               }
           }
           /*
           start % letters.length
             = 3 % 5
           letters[3 % 5]  → letters[3]

           start % letters.length
             = 4 % 4
           letters[4 % 4]  → letters[0]
            */
           return latters[start % latters.length];

    }

    public static void main(String[] args) {
           char[] letters = {'c','f','j'};
           char target = 'f';

        System.out.println(cellingOfTargetInCharacter(letters,target));
    }
}
