public class Class {
    public static void main(String[] args) {
        Dog kimmi=new Dog();
        Cat cat=new Cat();
        Human human=new Human();
        Tuna tuna=new Tuna();
        Shark shark=new Shark();
        Peacaok peacaok=new Peacaok();
        kimmi.legs=4;
        kimmi.barks();
        cat.legs=4;
        cat.Meow();
        human.legs=2;
        human.speaks();
        peacaok.fly=false;
        peacaok.nationalBird();
        tuna.canBeEaten=true;
        tuna.tuna();
        shark.canBeEaten=false;
        shark.shark();
        System.out.println("Mammels Legs:-");
        System.out.println("Dog "+kimmi.legs);
        System.out.println("Cat "+cat.legs);
        System.out.println("Human "+human.legs);
        System.out.println("Bird fly:-");
        System.out.println("Peakock "+peacaok.fly);
        System.out.println("Fish can be eaten:-");
        System.out.println("Tuna "+tuna.canBeEaten);
        System.out.println("Shark "+shark.canBeEaten);
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