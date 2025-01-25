/* 
Orignal code for recursie but when I wanted the value of a number it woulnt print 100 or 200 
 public class Fibonacci_Recursive {
    //method
    public static BigInteger fibonacciRecursive(int n){
        if(n < 0){
            System.out.println("needs to be non-negative");
        }
        if(n == 0){
            return BigInteger.ZERO;
        }
        if(n == 1){
            return BigInteger.ONE;
        }
        return fibonacciRecursive(n - 1).add(fibonacciRecursive(n - 2));
    }
    public static void main(String[] args) {
        int n = 200;  // Example value for n
        System.out.println(fibonacciRecursive(n));
    }
 */
//I used biginteger and memorozation for the code below due to the code approve not being 
//able to handle printing 100 and 200 and any big number. 
//Big integer given at Lab 
import java.math.BigInteger;
//Making a public class 
public class Fibonacci_Recursive {
    //somewhere to hold the numbers to be able to just pull them out 
    private static BigInteger[] hold;
    //method to calcute the fib number 
    public static BigInteger fibonacciRecursive(int n){
        //edge case test 
        /*if(n < 0){
            System.out.println("needs to be non-negative");
        }
        if(n > 200){
            System.out.println("needs less that or equal to 200");
        }*/
        //base case both 0, 1, 2 for fib because the result is 0 and would stop the recursion 
        if(n == 0){
            return BigInteger.ZERO;
        }
        if(n == 1){
            return BigInteger.ONE;
        }
        if(n == 2){
            return BigInteger.ONE;
        }
        //Making sure that if number exists, if not null then result is already avaiable
        if(hold[n] != null){
            return hold[n];
        }
        //this caculates the fib and adds it 
        //then stores it in hold to resuse 
        hold[n] =  fibonacciRecursive(n - 1).add(fibonacciRecursive(n - 2));
        return hold[n];
    }
    //main mathod 
    public static void main(String[] args) {
        int n = 200;  // Example value for n
        //makes the array to hold n + 1 so there is space 
        hold = new BigInteger[n+1];
        //edge cases to stop if value is not in between 0-200
        if(n > 200 || n < 0){
            System.out.println("The number has to be between 0-200, please try again");
        
        }
        else{
            //printing the n's fib number 
            System.out.println(fibonacciRecursive(n));
        }
    }

}
