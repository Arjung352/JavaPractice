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

        // Arrays!

        // printing pairs of the array
        /*
        public static void arrayPairs(int arr[]) {
        //outter loop
        for(int i=0;i<arr.length;i++){
            // inner loop to make pairs
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        } 
        } */
    //    printing subarray in arrays
    /*
    public static void subarray(int arr[]) {
        // outter loop
        for(int i=0;i<arr.length;i++){
            // inner loop to select window
            for(int j=i;j<arr.length;j++){
                // printing the elements from the window
                for(int k=i;k<=j;k++){
                    System.out.print("("+arr[k]+")");
                }
                System.out.println();
            }
        }
    } */
//    printing sum of the subarray in arrays

    public static int subarraySum(int arr[]) {
        /*
        // using brute force
        int sum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print("("+arr[k]+")");
                    currSum+=arr[k];
                }
                System.out.println();
                if(currSum>sum){
                    sum=currSum;
                } 
                currSum=0;
            }
        }
        return sum;
         */
        // using kadane's algo
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum, currSum);
        }
        return maxSum;
    }
 

    // Buy Sell stocks
    /*
    public static void buySellStocks(int arr[]) {
        int maxProfit=0;
        int buyingPrice=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(buyingPrice<arr[i]){
                int profit=arr[i]-buyingPrice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyingPrice=arr[i];
            }
        }
        System.out.println("MaxProfit-->"+maxProfit);
    }
         */

        // trapped rain water
        /*
        public static int trappedRainWater(int arr[]) {
            int length=arr.length;
            // calculating left max
            int leftMax[]=new int[length];
            leftMax[0]=arr[0];
            for(int i=1;i<length;i++){
               leftMax[i]=Math.max(leftMax[i-1], arr[i]); 
            }
            // calculating right max
            System.out.println();
            int rightMax[]=new int[length];
            rightMax[length-1]=arr[length-1];
            for(int k=length-2;k>=0;k--){
                rightMax[k]=Math.max(rightMax[k+1], arr[k]);
            } 
            // calculating trapped water
            int trappedrainWater=0;
            for(int j=0;j<length;j++){
                int waterLevel=Math.min(rightMax[j], leftMax[j]);
                trappedrainWater+=waterLevel-arr[j];
            }
            return trappedrainWater;
        }
             */

        // sorting techniques
        // bubble sorting 
        /*
        public static void bubbleSort(int arr[]) {
            // outter loop
            for(int i=0;i<arr.length-1;i++){
                // inner loop
                for(int j=0;j<arr.length-i-1;j++){
                    // swapping logic
                    if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            } 
        }
        printArr(arr);
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }        
    }
         */

    // selection sort
/*
    public static void selectionSort(int arr[]) {
        // outter loop
        for(int i=0;i<arr.length;i++){
            // inner loop
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                // comparing
                if(arr[minPos]>arr[j]){
                    minPos=j;
                } 
            }
            // replacing the numbers
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        printArr(arr);
    }
        public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }        
    }
 */
// insertion sort
/*
public static void insertionSort(int arr[]) {
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
        // finding the correct position
        while(prev>=0&&arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        // insertion
        arr[prev+1]=curr;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
     */


// 2d arrays
/*

// printing 2d arr
public static void printArr(int arr[][]) {
    int m=arr.length;//ROWS
    int n=arr[0].length;//COLOUMN
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println(" ");
    }
}
// spiral matrix

public static void spiralMatrix(int arr[][]) {
    int startRow=0;
    int startCol=0;
    int endRow=arr.length-1;
    int endCol=arr[0].length-1;
    
    // while condition
    while(startRow<=endRow&&startCol<=endCol){
        // printing top
        for(int i=startCol;i<=endCol;i++){
            System.out.print(arr[startRow][i] + " ");
        }
        // printing right
        for(int r=startRow+1;r<=endRow;r++){
           System.out.print(arr[r][endCol] + " ");
        }
        // printing bottom
        for(int b=endCol-1;b>=startCol;b--){
            if (startRow == endRow) break; // avoid duplicate row
            System.out.print(arr[endRow][b] + " ");
        }
        // printing left
        for(int l=endRow-1;l>startRow;l--){
            if ( startCol==endCol ) break; // avoid duplicate col
            System.out.print(arr[l][startCol] + " ");
        }
        startRow++;
        startCol++;
        endCol--;
        endRow--;
    }
    System.out.println();
}
     */

// diagonal sum of the array:-
/*
public static void diagonalSum(int arr[][]) {
    int Sum=0;
    for(int i=0;i<arr.length;i++){
        // calculating primary diagonal
            Sum+=arr[i][i];
            // calculating secondary diagonal
            if(i!=arr[0].length-i-1){
                Sum+=arr[i][arr[0].length-i-1]; 
            }
        }
        System.out.println("Sum of the diagonals are -->"+Sum);
}
         */

// search in sorted matrix
/*
public static boolean searchSortedMatrix(int arr[][], int key) {
    int row=0;
    int col=arr[0].length-1;
    while(row<arr.length&&col>=0){
        if(arr[row][col]==key){
            System.out.println("Key found at index ("+row+","+col+")");
            return true;
        }
        else if(key>arr[row][col]){
            row++;
        }
        else{
            col--;
        }
    }    
    System.out.println("Key not found");
    return false;
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
        // int number[]={2,3,-2,4};
        // arrayPairs(number);
        // subarray(number);
        // System.out.println(subarraySum(number));
        // buySellStocks(number);
        // System.out.println("trappedRainWater is -->"+trappedRainWater(number));
        // bubbleSort(number);
        // selectionSort(number);
        // insertionSort(number);
        // int twoDarr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // printArr(twoDarr);
        // spiralMatrix(twoDarr);
        // diagonalSum(twoDarr);
        int sortedMatrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        // searchSortedMatrix(sortedMatrix, 30);
    }
}
