// practicing java for external examination

import java.util.Scanner;
// performing oops concept
public class External {
        // write a code of java that accepts a numeric value and strores in an 1d array and find the smallest number in it

        public static int findSmallest(int arr[]){
        int len=arr.length;
        int smallest=arr[0];
        for(int i=0;i<len;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    } 

    public static void main(String[] args) {
   /* TV t1=new TV();
    t1.turnOf();
    t1.turnOn();
     */
    /*
    Calculator c1=new Calculator();
    c1.Adding();
    c1.Subtracting();
     */
    Scanner sc=new Scanner(System.in);
    String mobile=sc.nextLine();
    /*
    int arr[]=new int [10];
    System.out.println("Enter 10 number to find the smallest among them");
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter the "+(i+1)+" Value:");
        arr[i]=sc.nextInt();
    }
    System.out.println("Smallest Number is -->"+findSmallest(arr));
     */

    // Custom error handling
    try {
        Mobile m=new Mobile();
        m.setMobileNumber(mobile);
        
    } catch (Exception e) {
        System.out.println("Error:" + e.getMessage());
    }
    }
}

class Mobile{
    public void setMobileNumber(String mobile)throws InvalidMobileNumber{
        if(mobile.length()<10){
            throw new InvalidMobileNumber("Number has to be of 10 digits");
        }
        for(int i=0;i<mobile.length();i++){
            if(!Character.isDigit(mobile.charAt(i))){
                throw new InvalidMobileNumber("Only Number are allowed");
            }
        }
    }  
}

class InvalidMobileNumber extends Exception{
    InvalidMobileNumber(String msg){
        super(msg);
    }
}
// inheritance:
// inheriharirance is of 4 type
// singleLevel aswell as methods overriding(dynamic polymorphism)

/*
class Parent{
    Parent(){
        System.out.println("This is the constructor of the parent class");
}
     void eats(){
        System.out.println("NO");
    } 
}
 class Child extends Parent {
    Child(){
        super();
        System.out.println("This is the constructor of the Child class");
    }
     void eats() {
        System.out.println("YES");        
    }
} */

    // performing abstraction in java

    // abstraction can be achived using abstract keyword and interfaces

    // using abstract keyword
/*
abstract class Device {
    Device() {
        System.out.println("This is a Device constructor");
    }

    abstract void turnOf();
    abstract void turnOn();
}

class TV extends Device {
    TV() {
        System.out.println("It's a TV constructor");
    }


    void turnOf() {
        System.out.println("TV turned off.");
    }

    void turnOn() {
        System.out.println("TV turned on.");
    }
}

 */
// implementing interface and multiple inheritance

/*
interface Add {
 public void Adding();
}

interface Sub {
 public void Subtracting();
}

class Calculator implements Add,Sub{
    public void Adding() {
    System.out.println("Adding");    
    }
    public void Subtracting(){
        System.out.println("Subtracting");
    }
} */

