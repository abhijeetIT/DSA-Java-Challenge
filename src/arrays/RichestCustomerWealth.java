package arrays;

//question- https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {

    static int richestCustomer(int[][] accounts){
        if(accounts.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
           for(int person = 0 ; person < accounts.length ; person++){
               //when start new column then take input of sum
               int rowSum=0;
               for(int account = 0 ; account < accounts[person].length ; account++){
                  rowSum+=accounts[person][account];
               }
               //end of loop check sum is grater than older max?
               if(rowSum > max){
                   max=rowSum;
               }
           }
           return max;
    }

    public static void main(String[] args) {
     int[][] accounts = {
             {1,2,3},
             {4,2,1},
             {1,2}
     };
        System.out.println(richestCustomer(accounts));
    }
}
