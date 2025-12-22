package arrays;

/*
Questions(Day 8 21-12-2025)->https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=array
 */
public class MajorityElement {
    static int majorityElement(int[] arr){

        /*Boyer–Moore Voting Algorithm
        * Intuition (dimaag ka logic)
          Majority element itna zyada hota hai ki baaki sab elements milke bhi use cancel nahi kar paate
        * */
          int count =0, ans = 0;
          for(int i = 0; i < arr.length ; i++){
              if(count == 0) {            //starting and jab count 0 hoga to ans me number add lr denge
                  ans = arr[i];
              }
              if(arr[i] == ans){
                  count++;
              }else{
                  count--;
              }
          }
          return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,4,4,12,12,1};

        System.out.println(majorityElement(arr));
    }
}
