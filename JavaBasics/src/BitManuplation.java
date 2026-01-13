public class BitManuplation {
    // bitwise operators
    /*
    public static void bitwiseOperators(int num1, int num2) {
        // bitwise and (&) operator
        System.out.println(num1&num2);
        // bitwise or (|) operator
        System.out.println(num1|num2);
        // bitwise xor (^) operator
        System.out.println(num1^num2);
        // bitwise one's complement (~) operator
        System.out.println(~num1);
        // bitwise bitwise left shift  (<<) operator
        System.out.println(num1<<num2);
        // bitwise bitwise right shift  (>>) operator
        System.out.println(num1>>num2);
    }
         */
    // find odd or even
    /*
    public static void oddOrEven(int num) {
        int bitMask=1;
        if((num&bitMask)==0){
            System.out.println(num+" is an even number");
        }        
        else{
            System.out.println(num+" is an odd number");
        }
    } */

        // find the nth bit
        public static void findNthBit(int num,int n) {
            int bitMask=1<<n;
            if((num&bitMask)==0){
                System.out.println(0+" is the "+n+" bit in the number");            
            }
            else{
                System.out.println(1+" is the "+n+" bit in the number");            
            };
        }
    public static void main(String[] args) {
        // bitwiseOperators(6, 1);
        // oddOrEven(10);
        findNthBit(5, 2);
    }
}
