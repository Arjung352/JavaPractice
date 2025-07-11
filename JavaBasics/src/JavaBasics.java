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