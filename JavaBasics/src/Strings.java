import java.util.Scanner;
public class Strings {
    // strings using loops
    /*
    public static void stringUsingLoop(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
         */

    // palindrome in strings
/*
    public static boolean checkPalindrome(String str) {
        int len=str.length();
        for(int i=0;i<len;i++){
                    if(str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;

    }
         */

    // shortest path
    /*
         public static double shortestPath(String str) {
        int len=str.length();
        int x=0;
        int y=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='w'){
                x--;
            }
            else if(str.charAt(i)=='e'){
                x++;
            }
            else if(str.charAt(i)=='n'){
                y++;
            }
            else {
                y--;
            }
        }
        double minDistance=Math.sqrt((x*x)+(y*y));
        return minDistance; 

    }
 */

    // largest odd number in a string
    /*
public static String largestOddNumber(String str) {
    int end = str.length() - 1;

    while (end >= 0) {
        int digit = str.charAt(end) - '0'; // convert char to number
        
        if (digit % 2 == 1) {
            return str.substring(0, end + 1);
        }
        end--;
    }
    return "";
}
     */

    // letter to upper case
/* 
    public static String letterToUpperCase(String str) {
        StringBuilder result=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        result.append(ch);
        for(int i=1;i<str.length();i++){
            if(i<str.length()-1&&str.charAt(i)==' '){
                result.append(str.charAt(i));
                i++;
                result.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
        */

    // string compression
public static String stringCompression(String str) {
    if (str == null || str.length() == 0) {
        return str;
    }

    StringBuilder res = new StringBuilder();
    int counter = 1;

    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i - 1)) {
            counter++;
        } else {
            res.append(str.charAt(i - 1));
            res.append(counter);
            counter = 1;
        }
    }

    // append last character and its count
    res.append(str.charAt(str.length() - 1));
    res.append(counter);

    return res.toString();
}


public static void main(String[] args) {
    // strings in java
    // String str=new String("Hello world!");
    // String str1="Hello world!";
    // System.out.println(str);
    // System.out.println(str1);
    // they seem same but they both are diffrent at architectrural level

    // strings are also immutable

    // input from the user!
    Scanner sc = new Scanner(System.in);
    // String name=sc.nextLine();
    // System.out.println(name.length());

    // concatination
    /*
    System.out.println("Enter your First name");
    String fName=sc.next();
    System.out.println("Enter your Last name");
    String lName=sc.next();
    String fullName=fName+" "+lName;
    stringUsingLoop(fullName);
    */
   /*
    String str=sc.next();
    boolean result=checkPalindrome(str);
   if(result){
    System.out.println(str+" "+"is a palindrome");
}
else{
    System.out.println(str+" "+"is not a palindrome");
   }
     */
    // System.out.println(shortestPath("nwsenwseswwe"));
    // System.out.println(largestOddNumber("022116564"));
    // System.out.println(letterToUpperCase("hello world"));
    System.out.println(stringCompression("abc"));

}
}
