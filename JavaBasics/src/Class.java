public class Class {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount(7751);
        b1.setAccountDetails(007, "Arjun gupta");
        System.out.println(b1.getHolderName());
        System.out.println(b1.getAccountNumber());
        System.out.println(b2.getPassword());
    }
}
/*
class Pen {
float tip;
String name;
String colour;
    void setAttr(float PenTip,String PenName,String PenColour){
        tip=PenTip;
        name=PenName;
        colour=PenColour;
    }
    void printPen(){
        System.out.println(name+" "+"Colour "+colour+" Tip Size "+tip);
    }
}
 */

// access specifiers in java 
// there are 4 types of access specifiers in java:-
// 1. Private 
// 2. default 
// 3. protected 
// 4. public



// there are 3 types of constructors 
// 1.parameter constructors
// 2.non-parameter constructors
// 3.copy constructors


class BankAccount {
    public String holderName;
    private int accountNumber;
    private int password;
    // parameter constructors
    BankAccount(int password){
        this.password=password;
    }
        // non-parameter constructors
    BankAccount(){
        System.out.println("Constructor called!");
    }
    void setAccountDetails(int accountNumber,String holderName){
        this.holderName=holderName;
        this.accountNumber=accountNumber;
    }    
    int getAccountNumber(){
        return this.accountNumber;
    }
    String getHolderName(){
        return this.holderName;
    }
    int getPassword(){
        return this.password;
    }
}
// The four pillars of Object-Oriented Programming (OOP) are:-
//  Encapsulation
//  Abstraction
//  Inheritance
//  Polymorphism
//  These principles provide a robust framework for developing modular, reusable, and maintainable code by enabling developers to model real-world scenarios effectively, leading to scalable and adaptable software.


// Encapsulation: This involves bundling data (attributes) and the methods (functions) that operate on that data within a single unit, such as a class. It helps protect data by hiding its internal implementation and controlling access to it through public interfaces, preventing unintended modifications. 
