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
/*
public static int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
}
 */

// check if the array is sorted or not
/*
public static String checkSortedArr(int arr[], int base, int max) {
    if (max == arr.length) {
        return "Arraay Sorted";
    } else {
        if (arr[base] < arr[max]) {
            return checkSortedArr(arr, base + 1, max + 1);
        } else {
            return "Array not sorted";
        }
    }
}
     */

// find the first occurence of the number
/*
public static int findFirstOccur(int arr[],int flag,int i) {    
    if(i==arr.length){
        return -1;
    }
    else{
        if(arr[i]==flag){
            return i;
        }
        else{
            return findFirstOccur(arr, flag, i+1);
        }
    }
}
    
 */
/*
public static int lastOccurence(int arr[], int key, int i) {
    if (i == arr.length) {
        return -1;
    }

    int isFound = lastOccurence(arr, key, i + 1);

    if (isFound == -1 && arr[i] == key) {
        return i;
    }

    return isFound;
}
     */

// all occurances in the arr
/*
public static void allOccurance(int arr[],int key,int i) {
    if(i==arr.length){
        return;
    }    
    if(arr[i]==key){
        System.out.print(i+" ");
    }
    allOccurance(arr, key, i+1);
}
     */

// Number to words
public static void numToWords(int num) {
    String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    if(num==0){
        return;
    }
    int lastDigit=num%10;
    numToWords(num/10);
    System.out.print(arr[lastDigit]+" ");
    
}
    public static void main(String[] args) {
        // decreasingOrder(10);   
        // increasingOrder(10);
        // System.out.println(factorial(5));
        // System.out.println(sumOfnNumber(5));
        // System.out.println(fibonacci(5));
        // int arr[]={1,2,3,6,5,3,4,5,1};
        // System.out.println(checkSortedArr(arr,0,1));
        /*int result=lastOccurence(arr,3,0);
        if(result>=0){
            System.out.println("Value found at "+result);
        }
        else{
            System.out.println("Value not found");
        }*/
    //    allOccurance(arr, 1, 0);
    numToWords(2026);
}
}