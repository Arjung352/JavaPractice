import java.util.Scanner;
public class Recursion {
// decreasing Order
/* 
public static void decreasingOrder(int num) {
    System.out.println(num);
    num--;
    if(num>0){
        decreasingOrder(num);
    }
    return;
}
     */
// print numbers in increasing order
    /*
    public static void increasingOrder(int num) {
        if (num==1) {
            System.out.print(num+ " ");
            return;
        }
        increasingOrder(num-1);
        System.out.print(num+" ");
    }
         */
// calculate factorial
/*
public static int factorial(int n) {
    if(n==0){
        return 1;
    }    
    return n * factorial(n - 1);

} 
     */
// print sum of n natural numbers
/*
public static int sumOfnNumber(int n) {
    if(n==1){
        return 1;
    }    
    return n+sumOfnNumber(n-1);
}
     */

// fabonacci series
public static int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
}
    public static void main(String[] args) {
        // decreasingOrder(10);   
        // increasingOrder(10);
        // System.out.println(factorial(5));
        // System.out.println(sumOfnNumber(5));
        System.out.println(fibonacci(25));
}
}