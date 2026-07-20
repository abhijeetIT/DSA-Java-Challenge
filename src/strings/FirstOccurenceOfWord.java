package strings;

/*
Question => https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=string
 */
public class FirstOccurenceOfWord {
    static int firstOccurence(String haystack, String needle){
        int pos = -1;
           for(int i = 0 ; i < haystack.length() ; i++){
               for(int j = 0 ; j < needle.length() ; j++){
                   if(haystack.charAt(i) == needle.charAt(j)){
                       if(pos == -1){
                           pos = i;
                       }
                       i++;
                       continue;
                   }else{
                       break;
                   }
               }
           }
        return pos;
    }

    public static void main(String[] args) {
        System.out.println(firstOccurence("abhijeet","ls"));
    }
}
