public class Practice {

    // Hollow Rectangle
    /*
    public static void hollowRectangle(int size) {

        for (int i = 0; i < size; i++) {

            // First and last row
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
            } 
            // Middle rows
            else {
                System.out.print("*");
                for (int j = 0; j < size - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/
// inverted and rotated half pyramid
/*
public static void invertedPyramid(int len) {
    int var=1;
    for(int i=0;i<len;i++){
        for(int j=0;j<len;j++){
            if(j>=len-var){
                System.out.print("*");
            }
            else{

                System.out.print(" ");
            }
        }
        System.out.println();
        var++;
    }         
}
    */
//    inverted half pyramid with number
/*
public static void invertedPyramidWithNumber(int size) {
    // outter loop
    for(int i=0;i<size;i++){
        // inner loop
        for(int j=1;j<=size-i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
} */
// 0-1 triangle
/*
public static void zeroOne(int size) {
    // outterLoop
    for(int i=1;i<=size;i++){
        // inner loop
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
    }

}
     */
    // Floyd's triangle pattern
    /*
    public static void floydTriangle(int size) {
        int num=1;
        //outter loop
        for(int i=0;i<size;i++){
            // inner loop
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        } 
    }
         */
    // butterfly pattern
    /*
    public static void butterfly(int size) {
        // upper half of the butterfly
        for(int i=1;i<=size;i++){
            // printing starts
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // printing spaces
            for(int s=1;s<=2*(size-i);s++){
                System.out.print(" ");
            }
            // printing starts
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half of the butterfly
        for(int i=size;i>=1;i--){//1
            // printing stars
           for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // printing spaces
            for(int s=1;s<=2*(size-i);s++){
                System.out.print(" ");
            }
            // printing starts
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
         */
        // Solid rhombus
        /*
        public static void solidRhombus(int size) {
            // outter loop
            for(int i=1;i<=size;i++){
                // printing spaces
                for(int s=0;s<size-i;s++){
                    System.out.print(" ");
                }
                // printing stars
                for(int j=0;j<size;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
             */
        // hollow  rhombus
        /*
            public static void hollowRhombus(int size) {
                // outter loop
                for(int i=1;i<=size;i++){
                    // printing spaces
                    for(int s=0;s<size-i;s++){
                        System.out.print(" ");
                    }
                    // logic to print starts
                    for(int j=0;j<size;j++){
                        if(i==1||i==size||j==0||j==size-1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");  
                        }
                    }
                    System.out.println();
                }
}
                 */
        // Diamond pattern
        /*
        public static void diamond(int size) {
        for(int i=1;i<=size;i++){
        // printing spaces
        for(int j=1;j<=size-i;j++){
            System.out.print(" ");
        }
        // printing starts
        for(int k=1;k<=2*(i-1)+1;k++){
            System.out.print("*");
        }
        // printing spaces
        for(int j=1;j<=size-i;j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
        for(int i=size;i>=1;i--){
        // printing spaces
        for(int j=1;j<=size-i;j++){
            System.out.print(" ");
        }
        // printing starts
        for(int k=1;k<=2*(i-1)+1;k++){
            System.out.print("*");
        }
        // printing spaces
        for(int j=1;j<=size-i;j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
 */
    // palindrome pyramid
    /*
        public static void palimdromePyramid(int size) {
            // outter loop
            for(int i=1;i<=size;i++){
                // printing space
                for(int s=0;s<size-i;s++){
                    System.out.print(" ");
                }
                // printing number
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                // printing the numbers to the right
                for(int k=2;k<=i;k++){
                    System.out.print(k);
                }
                 // printing space
                for(int s=0;s<size-i;s++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
             */
    public static void main(String[] args) {
        // hollowRectangle(4);
        // invertedPyramid(5);
        // invertedPyramidWithNumber(5);
        // zeroOne(5);
        // floydTriangle(6);
        // butterfly(5);
        // solidRhombus(2);
        // hollowRhombus(7);
        // diamond(5);
        // palimdromePyramid(5);
    }
}
