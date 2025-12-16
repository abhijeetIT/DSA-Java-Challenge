package arrays;
/*
https://leetcode.com/problems/remove-element/?envType=problem-list-v2&envId=array
0 return indicate the empty of array or value not found
 */
public class RemoveElement {
    static int removeElement(int[] arr,int value){
        //if array is empty
        if(arr.length ==0){
            return 0;
        }
        int j=0;
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] != value){
                arr[j]=arr[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,23,4,1,3,4};
        int value=4;

        System.out.println(removeElement(arr,value));
    }
}
