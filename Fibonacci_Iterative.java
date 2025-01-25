// Define a class to hold the Fibonacci methods

import java.math.BigInteger;
//declare class 
public class Fibonacci_Iterative {
    //Big Interger was given in Lab to help when the number is too large and wouldnt print correctly 
    //Source: https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html
    //method 
    public static BigInteger fibonacciIterative(int n){
        //edge case 
        /*if(n < 0){
            System.out.println("needs to be non-negative");
        }
        if(n > 200){
            System.out.println("needs less that or equal to 200");
        }*/
        //Both 0, 1 and 2 base cases for it to just print 
        if(n == 0){
            return BigInteger.ZERO;
        }
        if(n == 1){
            return BigInteger.ONE;
        }
        if(n == 2){
            return BigInteger.ONE;
        }
        //variable to hold 0 and 1 to calcute the ib numbers 
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        //int num = 0;

        //printing tetsing 
        //System.out.println(first);
        //System.out.println(second);
        //for loop to caluculte all numbers 
        for(int i = 2; i <= n; i++){
            //vaibale to hold the next number 
            BigInteger following;

            //Fib caluction by adding the first and second values 
            following = second;
            second = second.add(first);
            first = following;
            //code before BigInterger function 
            //following = first + second;
            //first = second;
            //second = following;

            //testing to see if accurate 
            //System.out.println(second);
        }
        return second;
        
    }
    //Main method 
    public static void main(String[] args) {
        int n = 200;  // Example value for n
        //edge cases to stop if value is not in between 0-200
        if(n > 200 || n < 0){
            System.out.println("The number has to be between 0-200, please try again");
        
        }
        else{
            //printing the value of n's fib
            System.out.println(fibonacciIterative(n));
        }
        
    }

}

