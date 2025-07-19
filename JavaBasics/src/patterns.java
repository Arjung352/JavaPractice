
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
import java.util.Scanner;
public class patterns {
    public static void inverted_triangle(int size) {
    //  outter loop (rows)
        for(int i=0;i<=size;i++){
            for(int j=0;j<size;j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int size=sc.nextInt();
        inverted_triangle(size);
    }
}


