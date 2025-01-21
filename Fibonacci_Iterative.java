// Define a class to hold the Fibonacci methods

import java.math.BigInteger;

public class Fibonacci_Iterative {
    //Big Interger was given in Lab to help when the number is too large and wouldnt print correctly 
    //Source: https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html
    public static BigInteger fibonacciIterative(int n){
        if(n < 0){
            System.out.println("needs to be non-negative");
        }
        if(n == 0){
            return BigInteger.ZERO;
        }
        if(n == 1){
            return BigInteger.ONE;
        }

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        //int num = 0;

        System.out.println(second);

        for(int i = 2; i <= n; i++){
            //num += 1;
            BigInteger following;

            //following = first + second;
            following = second;
            second = second.add(first);
            first = following;
            //first = second;
            //second = following;
            
            System.out.println(second);
        }
        System.out.println("The program is done, it has calculated all numbers from 0 to 200, the 200th number is:");
        
        return second;
        
    }
    public static void main(String[] args) {
        int n = 200;  // Example value for n
        System.out.println(fibonacciIterative(n));
    }

}

