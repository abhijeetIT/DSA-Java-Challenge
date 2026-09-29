package arrays;

import java.util.LinkedHashMap;

public class FrequencyOfElement {

    public static LinkedHashMap<Integer,Integer> frequencyOfElement(int[] arr){
        LinkedHashMap<Integer,Integer> freq = new LinkedHashMap<>();

        for (int j : arr) {
            if (freq.containsKey(j)) {
                freq.put(j, freq.get(j)+1);
            } else {
                freq.put(j, 1);
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6,7,6,5,4,3,3,2,1,0};

        System.out.println(frequencyOfElement(arr));
    }
}
