// Taking input from the user!

// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Hello World");
//         System.out.println("Enter the value of a:-");
//         int a =sc.nextInt();
//         System.out.println("Value of a-->"+a);
//         System.out.println("Enter the value of b:-");
//         int b =sc.nextInt();;
//         System.out.println("Value of b-->"+b);
//         int sum =a+b;
//         System.out.println("Sum of a and b-->"+sum);
//     }
// }

// calculating average!

/*  import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number to find out its average!");
        System.out.println("Enter the value of A-->");
        int a = sc.nextInt();
        System.out.println("Enter the value of B-->");
        int b = sc.nextInt();
        System.out.println("Enter the value of C-->");
        int c = sc.nextInt();
        float average=(a+b+c)/3.0f;
        System.out.printf("Average of the entered 3 number is--> %.2f",average);
    }
} */


// calculating the area of a square!

/*
import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to the program to print area of square!");
    System.out.println("Enter the value of a side of square!");
    int input=sc.nextInt();
    int area=input*input;
    System.out.printf("Area of the square is ==>%d",area);
}
}
 */

// calculating the bill with gst inputed by the user!

/* import java.util.Scanner;
 public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to bill generator");
        System.out.println("Enter the value of 3 product");
        System.out.println("Product 1->");
        float product1=sc.nextFloat();
        System.out.println("Product 2->");
        float product2=sc.nextFloat();
        System.out.println("Product 3->");
        float product3=sc.nextFloat();
        System.out.println("Enter the percentage of GST->");
        float gst=sc.nextFloat();
        float TotalOfProduct=product1+product2+product3;
        float totalgst=((TotalOfProduct)/100)*gst;
        float total=TotalOfProduct+totalgst;
        System.out.printf("You're final bill is -->%.2f",total);
    }
 } */


//   Learning basics of operators
 
/*  public class JavaBasics {
public static void main(String[] args){ 
   int x, y, z;
x = y = z = 2; 
x += y;//x=x+y==4
y -= z;//y=y-z = 2-2
z /= (x + y);//z=z/(x+y)2
System.out.println(x + " " + y + " " + z);
}
} */

// positive number or negitive
/*
import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num>=0){
            System.out.println("The number is Positive");
        }
        else{
            System.out.println("The number is negetive");
        }

    }
} */


// Temperature
/*
import java.util.Scanner;
  public class JavaBasics {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter you're temperature:-");
    float temp = sc.nextFloat();
    if(temp>=100){
        System.out.println("You have a fever! consult a doctor");
    }
    else{
        System.out.println("You have normal a temperature.");
    }
}
}
  */


//   provide the day based on its number!
  /*
   
  import java.util.Scanner;
  public class JavaBasics {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the week from (1-7):-");
        int num=sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Today is Monday!");
                break;
            case 2:
                System.out.println("Today is Tuesday!");
                break;
            case 3:
                System.out.println("Today is wednesday!");
                break;
            case 4:
                System.out.println("Today is Thursday!");
                break;
            case 5:
                System.out.println("Today is Friday!");
                break;
            case 6:
                System.out.println("Today is Saturday!");
                break;
            case 7:
                System.out.println("Today is Sunday!");
                break;
            default:
            System.out.println("Where are you from man?");
                break;
        }
    }
  }
   */


//    wheather the year is leap year or not
/*
   import java.util.Scanner;
   public class JavaBasics {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to our program we will provide weather the year is leap year or not!");
        System.out.println("Enter the current year:-");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It's a leap year");
                }
                System.out.println("Not a leap year!");
            }
            System.out.println("It's a leap year");
        }
        else{
            System.out.println("Not a leap year!");
        }
    }
   }
     */

    //  Loops
    // While loops
/*
    public class JavaBasics {
    
        public static void main(String[] args) {
          int counter=0;
          while(counter<=100){
            System.out.printf("curruntly the value if counter is -->%d\n",counter);
            counter++;
          }  
        }}
*/

// Do-while loop
/*
import java.util.Scanner;
        public class JavaBasics {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            do{
                System.out.println("Enter a value");
                int val=sc.nextInt();
                System.out.printf("Entered value is %d\n",val);
                if(val==10){
                    break;
                }
            }while(true);
            System.out.println("Breaked out of a loop!");
        }}
 */

 /*
 import java.util.Scanner;
 public class JavaBasics {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        int input;
        int choice;
        do{
            System.out.println("Enter a number");
            input=sc.nextInt();
            if(input%2==0){
                evenSum+=input;
            }
            else{
                oddSum+=input;
            }
            System.out.println("Want to continue? \n Press 1 to continue and 0 to exit!");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Final even sum-->"+evenSum);
        System.out.println("Final odd sum-->"+oddSum);
    }
 } */


//  factorial!
/*
 import java.util.Scanner;
 public class JavaBasics {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its factorial!-->");
        int num=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
            System.out.println(factorial);
        }
        System.out.println("factorial for "+num+" is -->"+factorial);
    }
 } */


//  multiples

/*
import java.util.Scanner;
public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find its multiples:-");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " * "+i+" = "+ num*i);
        }
    }
} */


// inverted Star patterns
/*
public class JavaBasics {

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=10;j>=i;j--){
                System.out.print("*");
        }
        System.out.println();
        }        
                
    }
}
 */

// star pattern
/*
public class JavaBasics {

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
        }        
                
    }
} */

// star pattern using number's

/*
 public class JavaBasics {

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
        }
        System.out.println();
        }        
                
    }
} 
     */


     //  Function's

     /*
    public class JavaBasics {
    public static void printHello() {
        System.out.println("Hello World!");
        
    }
        public static void main(String[] args) {
            printHello();
        }
    }
*/


// functions with parameters:-
// with void return type!

/*
import java.util.Scanner;
public class JavaBasics {
public static void add(int a,int b) {
    int sum=a+b;
    System.out.println("Total of these 2 number is-->"+sum);
}
    public static void main(String[] args) {
        System.out.println("Enter 2 Number to find it's total:-");
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        add(a, b);
    }
}
     */


// with int return type!

/*
import java.util.Scanner;
public class JavaBasics {
public static int add(int a,int b) {
    int sum=a+b;
    return sum;
}
    public static void main(String[] args) {
        System.out.println("Enter 2 Number to find it's total:-");
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int sum=add(a, b);
        System.out.println("Total of these 2 number is-->"+sum);

    }
}
    */

    // calculating binomial cofficient!

    /*

    import java.util.Scanner;
    public class JavaBasics {
    // firstly need to write the code to find the factorial
public static int factorial(int value) {
    int factorial=1;
    for(int i=1;i<=value;i++){
        factorial*=i;
    }
    return factorial;
}
// logic for binomial cofficient
public static int binomial(int n,int r,int diff) {
    int binomial=n/(r*diff);
    return binomial;
}

// main function
    public static void main(String[] args) {
        System.out.println("Enter 2 Number to find it's Binomial Cofficient:-");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of N->");
        int a =sc.nextInt();
        System.out.println("Enter the value of R->");
        int b =sc.nextInt();
        int n=factorial(a);
        int r=factorial(b);
        int NminR=a-b;
        int diff=factorial(NminR);
        int binomial=binomial(n, r, diff);
        System.out.println("Binomial cofficient of these 2 number's are-->"+binomial);
    }
} */

// checking prime numbers

/*
import java.util.Scanner;
public class JavaBasics {
    public static boolean checkPrime(int a) {
        if(a==2){
            return true;
        }
        for(int i=2;i<=a-1;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check if its prime or not->");
        int num=sc.nextInt();
        System.out.println(checkPrime(num));
    }
}
     */

// this is an unoptimised way!

// lets solve it in more optimised way!

/*
import java.util.Scanner;
public class JavaBasics {
    public static boolean checkPrime(int a) {
        if(a==2){
            return true;
        }
        // here the loop won't run till n-1 
        // but instead loop run till root n because after that the number repeats
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check if its prime or not->");
        int num=sc.nextInt();
        System.out.println(checkPrime(num));
    }
}
 */

//  check prime number in a range

import java.util.Scanner;
public class JavaBasics {
    public static boolean checkPrime(int a) {
        if(a==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void range(int num) {
        for(int i=2;i<=num;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a range to find number's of prime in it");
        int num=sc.nextInt();
        range(num);
    }
}
