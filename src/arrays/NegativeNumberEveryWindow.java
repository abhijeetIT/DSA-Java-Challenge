package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NegativeNumberEveryWindow {

    static void findNegative(int[] arr, int windowSize){

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        System.out.println();
        for (int i = 0 ; i < windowSize ; i++){
            if (arr[i] < 0){
                queue.add(arr[i]);
            }
        }
        ans.add(queue.isEmpty()? 0 : queue.peek());

        for (int i = 1; i <= arr.length-windowSize ; i++){
            if (arr[i-1] < 0){
                queue.remove();
            }
            if(arr[i+windowSize-1] < 0){
                queue.offer(arr[i+windowSize-1]);
            }
            ans.add(queue.isEmpty() ? 0 : queue.peek());
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int windowSize = 3;

        findNegative(arr, windowSize);
    }
}
