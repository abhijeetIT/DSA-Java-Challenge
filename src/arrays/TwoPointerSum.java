package arrays;

public class TwoPointerSum {
    static void twoPointerSum(int[] arr,int target){
        int left=0,right= arr.length-1;

        boolean isFound=false;
        while(left < right){
            int sum=arr[right]+arr[left];
            if(sum == target){
                isFound=true;
                 break;
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        if(isFound){
            System.out.println("The target archive in index: "+left+" and "+right);
        }else {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,11,12,22,33};
        int target = 10;
        twoPointerSum(arr,target);
    }
}
