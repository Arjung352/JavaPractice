/*
public class Exection_Handling{
    public static int divide(int a,int b){
        // with the proper exception
        try {
            return a/b;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
    public static void main(String[] args) {
//        practicing exception handling
//        without exception handling
// Here without the exeption handling the code breaks and stop running futher and exits without any exception handing leaving the code hanging in middle
        int[] numerator={10,20,30,40};
        int[] denomenator={1,2,0,4};
        for(int i=0;i<4;i++){
            System.out.println(divide(numerator[i],denomenator[i]));
        }
        System.out.println("Good Job :)");
    
    }

}
     */

    //  there are 5 main blocks in exception handeling in java
    // it is important to handle the error gracefully and to not disturb the code execution

    // the 5 elements in this are:-
    // 1.try:-Defines a block of code to test for errors
    // 2.catch:-Defines a block of code to handle an error
    // 3.finnaly:-Executes code after try/catch, regardless of the result
    // 4.throw:-Used to explicitly throw an exception
    // 5.throws:-Declares exceptions that a method may throw

    // there are 2 types of exeption:-
    // checked (checked at the compile time) and unchecked (checked at the runtime)

    /*public class Exection_Handling {
        public static int throwingError(int a,int b)throws ArithmeticException {
            
            try {
              int result=a/b; 
              return result;
            } catch (Exception e) {
                throw new ArithmeticException("Cannot devide by 0");
            } 

        }
        public static void main(String[] args) {
            try {
                System.out.println(throwingError(10, 0));
            } catch (Exception e) {
                System.out.println(e);
            }
            finally{
                System.out.println("Hello world");
            }
        }   
        
    }
*/


// using custom error
import myPackage.CustomError;  // importing from your package

public class ExceptionHandling {
    public static void main(String[] args) {
        CustomError err = new CustomError();
        try {
            err.checkAge(10);  // calling method that throws custom exception
        } catch (CustomError.InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
