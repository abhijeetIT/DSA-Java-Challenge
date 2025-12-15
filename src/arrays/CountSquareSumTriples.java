package arrays;

//Day 2 Problem 4 essy
public class CountSquareSumTriples {
    public static int countSquareSumTriples(int n){
        int count=0;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= n ; j++){
                int c2 = i*i + j*j; // a² + b² = 100
                int c = (int) Math.sqrt(c2); // it gives 100 is sqrt of 10
                // Check if c² equals a² + b² and c is within range
                if(c * c == c2 && c <= n){ //here check 10*10 = 100 and 10 == 10
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num=10;
        System.out.println(countSquareSumTriples(num));
    }

}
