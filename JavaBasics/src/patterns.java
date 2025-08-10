
// Hollow reactangle
/*
import java.util.Scanner;
public class patterns {
    public static void hollow_reactangle(int total_rows, int total_coloumns) {
    //  outter loop (rows)
        for(int i=1;i<=total_rows;i++){
            for(int j=1;j<=total_coloumns;j++){
                // check for boundry 
                if(i==1||j==1||i==total_rows||j==total_coloumns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
     }   
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and column to print a hollow reactangle");
        int rows=sc.nextInt();
        int column=sc.nextInt();
        hollow_reactangle(rows, column);
    }
}
     */

    //  Iverted half triangle
    /*
import java.util.Scanner;
public class patterns {
    public static void inverted_triangle(int size) {
    //  outter loop (rows)
    for(int i=1;i<=size;i++){
        // inner loop
        // for printing spaces:-
        for(int j=1;j<=size-i;j++){
            System.out.print(" ");            
        }
        // printing starts
        for(int j=1;j<=i;j++){
            System.out.print("*");            
        }
        System.out.println("");
    }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int size=sc.nextInt();
        inverted_triangle(size);
    }
}
     */

    //  Iverted half triangle using number's
    /*
import java.util.Scanner;
public class patterns {
    public static void inverted_triangle(int size) {
        //  outter loop (rows)
    for(int i=0;i<size;i++){
        // inner loop
        for(int j=1;j<=size-i;j++){
            System.out.print(j);            
        }
        System.out.println("");
    }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int size=sc.nextInt();
        inverted_triangle(size);
    }
}
     */

    //  0-1 triangle
    /*
import java.util.Scanner;
public class patterns {
    public static void inverted_triangle(int size) {
        //  outter loop (rows)
    for(int i=1;i<=size;i++){
        // inner loop
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print(1+" ");
            }
            else{
                System.out.print(0+" ");
            }
    }
    System.out.println("");
    }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int size=sc.nextInt();
        inverted_triangle(size);
    }
}
 */

//  printing butterfly pattern
/*
import java.util.Scanner;;
public class patterns {
public static void butterfly(int n) {//4
    // outterLoop
    for(int i=1;i<=n;i++){//1
        // printing stars
            for(int k=1;k<=i;k++){//1
                System.out.print("*");
            }
            // printing spaces
            for(int l=1;l<=2*(n-i);l++){//
                System.out.print(" ");
            }
            // printing stars
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // inverse
    for(int i=n;i>=1;i--){//1
        // printing stars
            for(int k=1;k<=i;k++){//1
                System.out.print("*");
            }
            // printing spaces
            for(int l=1;l<=2*(n-i);l++){//
                System.out.print(" ");
            }
            // printing stars
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        butterfly(num);
    }
}
*/
// solid rhombus!
/* 
import java.util.Scanner;;
public class patterns {
public static void rhombus(int n) {
    for(int i=1;i<=n;i++){
        // printing spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // printing starts
        for(int k=1;k<=n;k++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        rhombus(num);
    }
}
*/
// hollow rhombus!
/*
import java.util.Scanner;;
public class patterns {
public static void rhombus(int n) {
    for(int i=1;i<=n;i++){
        // printing spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // printing starts
        for(int k=1;k<=n;k++){
            if(i==1||i==n||k==1||k==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        rhombus(num);
    }
}
     */
    // diamond pattern
    /*
    import java.util.Scanner;;
public class patterns {
public static void diamond(int n) {
    for(int i=1;i<=n;i++){
        // printing spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*(i-1)+1;k++){
            System.out.print("*");
        }
        // printing spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
    for(int i=n;i>=1;i--){
        // printing spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*(i-1)+1;k++){
            System.out.print("*");
        }
        // printing spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        diamond(num);
    }
} */

// pyramid of numbers
/*
import java.util.Scanner;
public class patterns {
public static void pyramid(int n) {
    // outter loop
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(i+ " ");
        }
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        System.out.println( " ");
    }    
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        pyramid(num);
    }
}
 */

//  palimdrome pyramid
/*
import java.util.Scanner;
public class patterns {
public static void palimdromePyramid(int n) {
    // outter loop
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k=i;k>=1;k--){
            System.out.print(k);
        }
        for(int l=2;l<=i;l++){
            System.out.print(l);
        }
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        System.out.println( " ");
    }    
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        palimdromePyramid(num);
    }
}
     */

    //  floyd triangle
    
    public class patterns {
    public static void floydTriangle(int n) {
        int counter=1;
        // outter loops
        for(int i=1;i<=n;i++){
            // inner Loop
            for(int j=0;j<i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println(" ");
        }
    }
        public static void main(String[] args) {
            int num=5;
            floydTriangle(5);
        }
    }