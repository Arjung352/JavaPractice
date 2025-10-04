public class Class {
    public static void main(String[] args) {
        /*
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.setName("Arjun");
        s2.setName("Ansh");
        s3.setName("Adarsh");
        s1.schoolName="SGTBIMIT";
        System.out.println(s1.schoolName);
        s1.showName();
        System.out.println(s2.schoolName);
        s2.showName();
        System.out.println(s3.schoolName);
        s3.showName();
         */
        Dog kimmi=new Dog();
        System.out.println(kimmi.colour);
        }
}

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

// Inheritance:Inheritance in Java is a core principle of Object-Oriented Programming (OOP) that allows a class to inherit properties (fields) and behaviors (methods) from another class. This mechanism promotes code reusability and establishes an "IS-A" relationship between classes, such as a "Dog IS-A Animal."

// types of inheritance in java:
// there are 4 types of inheritace in java

// 1. Single level
/*
class Animal {
    String colour;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
    
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barks");
    }
}
     */ 
// Multilevel Inheritance
/*
class Animal{
    int colour;
    void eat(){
        System.out.println("Eats");
    }
}

class mammel extends Animal{
    int legs;
}
class Dog extends mammel{
    boolean breads;
}

 */

//3. Hierarchical Inheritance
/*
class Animal {
    String colour;
    void eats(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    void swims(){
        System.out.println("Fish Swims in the water");
    }
}
class Dog extends Animal{
    void walks(){
        System.out.println("Dogs can walk!");
    }
}
     */


// 4.Hybrid Inheritance

/*
class Animal{
    String Colour;
    void eats(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}
class Fish extends Animal{
    boolean canBeEaten;
    void swims(){
        System.out.println("The fish can swims");
    }
}
class Tuna extends Fish{
    void tuna(){
        System.out.println("Tuna can be eaten");
    }
}
class Shark extends Fish{
    void shark(){
        System.out.println("Sharks cannot be eaten, Theyll eats us!");
    }
}

class Bird extends Animal{
    boolean fly;
    void flying(){
        System.out.println("A bird can fly");
    }
}
class Peacaok extends Bird{
    void nationalBird(){
        System.out.println("Peacaok is our national animal");
    }
} 

class Mammel extends Animal{
    int legs;
}
class Dog extends Mammel{
    void barks(){
        System.out.println("Dogs Barks");
    }
}
class Human extends Mammel{
    void speaks(){
        System.out.println("Human Speaks");
    }
}
class Cat extends Mammel{
    void Meow(){
        System.out.println("Cat Meow");
    }
}
     */


    //  Polymorphism
    // Polymorphism in Java is one of the core concepts in object-oriented programming (OOP) that allows objects to behave differently based on their specific class type.

// There are 2 types of polymorphism 
// Method overloading(Compile Time Polymorphism Static)
// Method overriding(Run Time Polymorphism Dynamic)

// method overloading
/*
class MethodOverloading{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
     */

    //  method overriding
    // when parent and child class both have same fucntion but with the diffrent defination

    /*
    class MethodOverriding{
        void eat(){
            System.out.println("Eats Nothing");
        }
    }
    class Child extends MethodOverriding  {
        void eat(){
            System.out.println("Eats foods");
        }   
        
    }
 */


//  Abstraction 
// Abstraction in Java is the process of hiding internal implementation details and showing only essential functionality to the user. It focuses on what an object does rather than how it does it.

// there are 2 ways we can achive abstraction in java
// 1. using Abstract keyword
// 2. using Interfaces


// Abstract classes

// points to remember in abstract classes:-
// 1.we cannot make the instance or object of an abstaract class
// 2.we can have abstract and non-abstract methods in it.
// 3.we can have construtor in abstract class.
// 4.abstract methods are only supposed to be initialized we cannot define its working we can only initialize it once a class inherits it then that class is supposed to define its working and its compulsary
// 5. One more thing that a constructors of multilevel classes are supposed to be called Hierarchical way top to bottom 

/*abstract class Remote{
    Remote(){
        System.out.println("Its an Abstract class");
    }
    abstract void turnOf();
    abstract void turnOn();
} 

class Tv extends Remote{
    Tv(){
        System.out.println("Its a Tv constructor");
    }
    void turnOf() {
        System.out.println("Tv turned of.");
    }
    void turnOn() {
        System.out.println("Tv turned on.");
    }
}*/


// Interfaces
// An Interface in Java programming language is defined as an abstract type used to specify the behaviour of a class. An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.

// The interface in Java is a mechanism to achieve abstraction.
// By default, variables in an interface are public, static and final.
// It is used to achieve abstraction and multiple inheritance in Java.
// It supports loose coupling (classes depend on behavior, not implementation).
// In other words, interfaces primarily define methods that other classes must implement.
// An interface in Java defines a set of behaviours that a class can implement, usually representing a CAN-DO relationship, but not always in every scenario.

/*
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Left,Right,Up,Down,Diagonal-(In all 4 directions)");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("Top(2 steps),Bottom(1 Steps)");
    }
}
     */


    //  implementing multiple inheritance
/*
    interface Add{
        int add(int a,int b);
    }
    interface Sub{
        int sub(int a,int b);
    }
    class Cal implements Add,Sub{
        public int add(int a ,int b){
            return a+b;
        }
        public int sub(int a ,int b){
            return a-b;
        }
    } 
         */



//  Static keyword
// The static keyword in Java is mainly used for memory management, allowing variables and methods to belong to the class itself rather than individual instances. The static keyword is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class rather than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.

/*
class Student{
    int rollNo;
    String Name;

    static String schoolName;

    void setName(String Name){
        this.Name=Name;
    }
    void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    void showName(){
        System.out.println(Name);
    }
    void showRollNo(){
        System.out.println(rollNo);
    }
}
     */



    //  Super keyword
    // The super keyword in Java is a reference variable that is used to refer to the parent class when we are working with objects.

    class Animal{
        String colour;
        Animal(){
            System.out.println("Animal constructor is called");
        }
    }
    class Dog extends Animal{
        Dog(){
            super();//This will initialize the constructor of the parent class
            super.colour="Black";//Accessing parent class variable and settig a value in it
            System.out.println("DOg class constructor is called");
        }
    }