/*
import java.util.Scanner;
public class Arrays {
    public static void calcAverage(int size) {
        Scanner sc= new Scanner(System.in);
        int sub[]=new int[size];
        System.out.println("Enter all the marks-->");
        for(int i=0;i<sub.length;i++){
            sub[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<sub.length;i++){
            total+=sub[i];
        }
        System.out.println("Enter maximum marks per subject -->");
        int maxPerSubject = sc.nextInt();
        int totalMaxMarks = maxPerSubject * size;

        float percentage = (total * 100.0f) / totalMaxMarks;
        System.out.println("Total percentage you've accuired is -->"+  percentage );
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of subjects-->");
        int size=sc.nextInt();
    calcAverage(size);
    }
}
 */

 //                             performing linear search 


 /*
 import java.util.Scanner;
 public class Arrays {
 public static int search(int num) {
    int array[]={2,4,6,8,10,12,14,16,18,19,20};
    for(int i=0;i<array.length;i++){
        if(array[i]==num){
            return i;
        }
    }
    return -1;
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an element to perform search!-->");
        int num=sc.nextInt();
        int index=search(num);
        if(index!=-1){
            System.out.println("Value found at index "+index);
        }
        else{
            System.out.println("value cannot be found!");
        }
    }
 }
     */

     //                             largest in an array!

     /*
     import java.util.Scanner;
 public class Arrays {
 public static int searchLargest(int arr[]) {
    int largest=arr[0];
    for(int i=0;i<arr.length;i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
    }
    return largest;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[10];
            System.out.println("Enter the 10 values in an array to find largest value in it-->");
        for(int i=0;i<10;i++){
            System.out.println("Enter the "+(i+1)+" value-->");
            array[i]=sc.nextInt();
        }
        int largest=searchLargest(array);
        System.out.println("Larget value in the Array is --> "+largest);
    }
 }
 */

//                          binary seach
 /*
import java.util.Scanner;
public class Arrays {
public static int binarySearch(int array[],int key) {
    int start=0;
    int end=array.length-1;
    while (start<=end) {
        int mid =(start+end)/2;
        if(array[mid]==key){
            return mid;
        }
        if(array[mid]<key){//right
            start=mid+1;
        }
        else{//left
            end=mid-1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int array[]={2,4,6,8,10,12,14,16,18,20};
        int key=10;
        int value=binarySearch(array, key);
        if(value!=-1){
            System.out.println("Key found at position "+value);
        }
        else{
            System.out.println("Key cannot be found in the array!");
        }
    }
}
     */

    //                      Reverse an array
/*
    public class Arrays {
    public static void reverse(int arr[]) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String[] args) {
            int array[]={2,4,6,8,10,12,14,16,18,20};
            reverse(array);
        }
    }
         */

        //  making pair's from an array:-
/*
public class Arrays {
    public static void findPair(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("{"+arr[i]+","+arr[j]+"}");
            }
            System.err.println("");
        }
    }    
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        findPair(array); 
    }
}
*/

// printing SubArrays
/*
public class Arrays {
    public static void subArrays(int arr[]) {
        // outter loop
        for(int i=0;i<arr.length;i++){//0
            // inner loop
            for(int j=i;j<arr.length;j++){//0 1 2 3 4
                // priniting SubArrays
                for(int k=i;k<=j;k++){//0 01 012 0123 01234
                    System.out.print(arr[k]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }        
    }
public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    subArrays(arr);
}    
}
 */


//                  printing MaxSubArraysSum using bruteforce!
/*
public class Arrays {
public static void MaxSubArraysSum(int arr[]) {
    int currentSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){//0
        for(int j=i;j<arr.length;j++){//0
            currentSum=0;
            for(int k=i;k<=j;k++){
                currentSum+=arr[k];
                System.out.println(currentSum);
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
    }
    System.out.println("Max Sum is -->"+maxSum);
}
    public static void main(String[] args) {
      int array[]={2,4,6,8,10};
      MaxSubArraysSum(array);  
    }
} 
     */

    //  MaxSubArraysSum using prefix!
 /*   
public class Arrays {
public static void MaxSubArraysSum(int arr[]) {
    int currentSum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]=new int[arr.length];
    prefix[0]=arr[0];
        // calculating prefix array:-
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        } 
        // prefix array is an array of total of previous elements in an array
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currentSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Max sum of sub array is -->"+maxSum);
}
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        MaxSubArraysSum(arr);
    }
}
     */
     
    // kadane's algorithem for max sum subarray!
    /*
    public class Arrays {
    public static void kadanes(int arr[]) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(currentSum, maxSum);
        }
        System.out.println("Max sum of sub array is -->"+maxSum);
    }
        public static void main(String[] args) {
            int arr[]={-2,-3,4,-1,-2,1,5,-3};
            kadanes(arr);
        }
    }
          */
// calculating total of an array
/*
         public class Arrays {
         
            public static void main(String[] args) {
                int array[]={-2,-3,4,-1,-2,1,5,-3};
                int total=0;
                for(int i=0;i<array.length;i++){
                    total+=array[i];
                    System.out.println(total);
                }
            }
         }
             */

             /*
    // Trapped rain water
    public class Arrays {
    public static void TrappedRainWater(int arr[]) {
        int length=arr.length;
        // calculating left max boundry
        int leftMax[]=new int[length];
        leftMax[0]=arr[0];
        for(int i=1;i<length;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        // calculating right max boundry
        int rightMax[]=new int[length];
        rightMax[length-1]=arr[length-1];
        for(int i=length-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
    int trappedWater=0;
    for(int i=0;i<length;i++){
        int waterLevel=Math.min(rightMax[i], leftMax[i]);
        trappedWater+=waterLevel-arr[i];
    }
    System.out.println("Trapped water is -->"+trappedWater);
}
        public static void main(String[] args) {
            int arr[]={4,2,0,6,3,2,5};
            TrappedRainWater(arr);
        }
    }
         */

        //  Buying and selling stocks 
        /*
        public class Arrays {
        public static void BuySellStocks(int price[]) {
            int buyPrice=Integer.MAX_VALUE;
            int maxProfit=0;
            for(int i=0;i<price.length;i++){
                if(buyPrice<price[i]){
                    int profit=price[i]-buyPrice;
                    maxProfit=Math.max(maxProfit, profit);
                }
                else{
                    buyPrice=price[i];
                }
            }
            System.out.println(maxProfit);
        }
            public static void main(String[] args) {
                int prices[]={7,1,5,3,6,4};
                BuySellStocks(prices);
            }
        }
             */
            // practiced max profit
            /*
            public class Arrays {
            public static void maxProfit(int arr[]) {
                // initialize with the max value
                int buyPrice=Integer.MAX_VALUE;
                int maxProfit=0;
                for(int i=0;i<arr.length;i++){
                    // find the lowest value to set it as a buyPrice
                    if(buyPrice>arr[i]){
                        buyPrice=arr[i];
                    }
                    // if buyPrice is smaller than the current price 
                    else{
                        // calculate the profit
                        int profit = arr[i] - buyPrice;
                        // compare the profit and choose the max profit
                        maxProfit=Math.max(profit,maxProfit);
                    }
                }
                System.out.println("Max profit is -->"+maxProfit);
            }
                public static void main(String[] args) {
                int arr[]={7,1,5,3,6,4}; 
                maxProfit(arr);  
                }
            }
                  */
                  
                
                  //   practicing the trapped water
                  /*
public class Arrays {
public static void trappedRainWater(int arr[]) {
    int length=arr.length;
    // calculating leftMax
    int leftMax[]=new int[length];
    leftMax[0]=arr[0];
    for(int i=1;i<length;i++){
        leftMax[i]=Math.max(arr[i],leftMax[i-1]);
    }
    // calculating rightMax
    int rightMax[]=new int[length];
    rightMax[length-1]=arr[length-1];
    for(int i=length-2;i>=0;i--){
        rightMax[i]=Math.max(arr[i],rightMax[i+1]);
    }

    // now finding waterLevel and trapped water

    int trappedRainWater=0;
    for(int i=0;i<length;i++){
        int waterLevel=Math.min(rightMax[i], leftMax[i]);
        trappedRainWater+=waterLevel-arr[i];
    }
    System.out.println("Trapped Rain Water-->"+trappedRainWater);
}
    public static void main(String[] args) {
     int arr[]={4,2,0,6,3,2,5};
     trappedRainWater(arr);   
    }
}
     */

    //  practice question for the array from the sheet


    //  finding duplicates in an array
    /*
    public class Arrays {
    public static boolean findDuplicates(int arr[]) {
        // outterLoop
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
        public static void main(String[] args) {
            int arr[]={1,2,4,8};
            boolean result=findDuplicates(arr);
            System.out.println("Is the array contain any duplicates?-->"+result);
        }
    }
         */

        //  find the max profit
/* 
        public class Arrays {
        public static void maxProfit(int arr[]) {
            int buyPrice=Integer.MAX_VALUE;
            int maxProfit=0;
            for(int i=0;i<arr.length;i++){
                if(buyPrice>arr[i]){
                    buyPrice=arr[i];
                }
                else{
                    int profit=arr[i]-buyPrice;
                    maxProfit=Math.max(maxProfit, profit);
                }
            }
            System.out.println("Max profit is -->"+maxProfit);
        }
            public static void main(String[] args) {
                int arr[]={4,2,1,6,3,2,5};
                maxProfit(arr);
            }
        }
            */

            // find water trapped
            /*
            public class Arrays {
            public static void trappedRainWater(int arr[]) {
                // calculating auxillary array's
                // left max array
                int length=arr.length;
                int leftMax[]=new int[length];
                leftMax[0]=arr[0];
                for(int i=1;i<length;i++){
                    leftMax[i]=Math.max(arr[i],leftMax[i-1]);

                } 
                // calculating rightMax
                int rightMax[]=new int[length];
                rightMax[length-1]=arr[length-1];
                for(int i=length-2;i>=0;i--){
                    rightMax[i]=Math.max(arr[i],rightMax[i+1]);
                }
                // calculating trapped rainWater
                int trappedRainWater=0;
                for(int i=0;i<length;i++){
                    int waterLevel=Math.min(rightMax[i],leftMax[i]);
                    trappedRainWater+=waterLevel-arr[i];
                }
                System.out.println("Trapped rainwater is -->"+trappedRainWater);
            }
                public static void main(String[] args) {
                    int arr[]={4,2,0,6,3,2,5};
                    trappedRainWater(arr);
                }
            }
                 */















//                                          2D Arrays


// Printing and taking input in 2d arrays
/*
import java.util.Scanner;
public class Arrays {
    
public static void Two_D_Arrays(int arr[][]) {
    // Taking input for 2d arrays
    Scanner sc= new Scanner(System.in);
    int m=arr.length;//ROWS
    int n=arr[0].length;//COLOUMN
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.println("Enter the value of index "+(i)+" "+(j)+" -->");
            arr[i][j]=sc.nextInt();
        }
    }

    // printing the 2d Arrays
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println(" ");
    }
}
    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        Two_D_Arrays(arr);
    }
}  
 */


// Searching in 2d matrix
/*
import java.util.Scanner;
public class Arrays {
    
public static void Two_D_Arrays(int arr[][]) {
    // Taking input for 2d arrays
    Scanner sc= new Scanner(System.in);
    int m=arr.length;//ROWS
    int n=arr[0].length;//COLOUMN
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.println("Enter the value of index "+(i)+" "+(j)+" -->");
            arr[i][j]=sc.nextInt();
        }
    }
    
    System.out.println("Enter a key to find it inside the array-->");
    int key=sc.nextInt();
    int flag=0;
    // printing the 2d Arrays
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]==key){
                flag=1;
            }
            System.out.print(arr[i][j]+" ");
        }
        System.out.println(" ");
    }
    if(flag!=1){
        System.out.println("Element not found in the array");        
    }
    else{
        System.out.println("Element found in the array");
    }
}
    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        Two_D_Arrays(arr);
    }
}  
     */

    //  largest and smallest number in the array

    /*
    import java.util.Scanner;
    public class Arrays {
    public static void Two_D_Arrays(int arr [][]) {
        Scanner sc=new Scanner(System.in);
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int m=arr.length;
        int n=arr[0].length;
        // taking values in the array
        // rows
        for(int i=0;i<m;i++){
            // coloumn
            for(int j=0;j<n;j++){
                System.out.println("Enter the value of index ("+i+" "+j+")");
                arr[i][j]=sc.nextInt();
                // calculating largest value
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
                // calculating largest value
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        
        // printing the array:-
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }

        // printing the smallest and the largest values
        System.out.println("Smallest Value in the matrix is -->"+smallest+"\nLargest value in the matrix is -->"+largest);
    }
        public static void main(String[] args) {
            int arr[][]=new int [3][3];
            Two_D_Arrays(arr);
        }
    }
         */


        //  spiral matrix

        /*
        public class Arrays {
        public static void spiralMatrix(int arr[][]) {
            int startRow=0;
            int startColoumn=0;
            int endRow=arr.length-1;
            int endColoumn=arr[0].length-1;
            while(startColoumn<=endColoumn&&startRow<=endRow){
                
            }
        }
            public static void main(String[] args) {
                int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
                spiralMatrix(arr);
            }
        }
             */



            //  diagonal matrix
            /*
            public class Arrays {
            public static void diagonalMatrixSum(int arr[][]) {
                int sum=0;
                // solution using brute force visitng every single element
                
                // for(int i=0;i<arr.length;i++){
                //     for(int j=0;j<arr[0].length;j++){
                //         if(i==j){
                //             sum+=arr[i][j];
                //         }
                //         if(i+j==arr.length-1){
                //             sum+=arr[i][j];
                //         }
                //     }
                // }
                //      
                    // more optimised approach 
                     for(int i=0;i<arr.length;i++){
                        // primary diagonal
                        sum+=arr[i][i];

                        // secondary diagonal
                        if(i!=arr.length-1-i){
                            sum+=arr[i][arr.length-1-i];
                        }
                     }
                System.out.println(sum);
            }
                public static void main(String[] args) {
                     int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
                     diagonalMatrixSum(arr);
                }
            }
             */


            //  search in sorted matrix
/*
            public class Arrays {
            public static boolean searchSortedMatrix(int arr[][], int key) {
                int row=0; 
                int col=arr[0].length-1;
                while (row<arr.length&&col>=0) {
                    if(arr[row][col]==key){
                        System.out.println("Key found at index ("+row+","+col+")");
                        return true;
                    }
                    else if(key<arr[row][col]){
                        col--;
                    }
                    else {
                        row++;
                    }
                }
                System.out.println("Key not found");
                return false;
            }
                public static void main(String[] args) {
                    int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
                    searchSortedMatrix(arr,33);
                }
            }
                 */



  //  performing search in the sorted matrix!
/* 
public class Arrays {
    public static boolean searchSortedMatrix(int arr[][],int key){
        int row=arr.length-1;
        int coloumn=0;
        while(row>=0&&coloumn<arr[0].length){
            if(arr[row][coloumn]==key){
                System.out.println("Key found at index ("+row+","+coloumn+")");
                return true;
            }
            else if(key>arr[row][coloumn]){
                coloumn++;
            }
            else{
                row--;
            }
        }
        System.out.println("Cannot find the key!");
        return false;
    }
    public static void main(String[] args) {
    int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    searchSortedMatrix(arr,33);

    }
}
*/

//  sum of the diagonal matrix
/*
public class Arrays {
    public static void diagonalMatrixSum(int arr[][]) {
        // using brute force (Less optimised approach)
        // primary diagenal
        
    //     int primarySum=0;
    //     int secondarySum=0;
    //     for(int i=0;i<arr[0].length;i++){
    //         for(int j=0;j<arr.length;j++){
    //             if(i==j){
    //                 primarySum+=arr[i][j];
    //             }
    //             // secondry sum
    //             if(i+j==arr.length-1){
    //                 secondarySum+=arr[i][j];
    //             }                
    //         }
    //     }
    // System.out.println("Primary Sum -->"+primarySum);
    // System.out.println("Secondary Sum -->"+secondarySum);
    //  
// More optimised approach
    int primarySum=0;
    int secondarySum=0;
    for(int i=0;i<arr.length;i++){
        primarySum+=arr[i][i];
        // but if the matrix is odd like 3*3 or 5*5 so one term will be common in both the sums to encounter this 
    if(i!=arr.length-1-i){
        // for example m*n=5 so (3,3) would come 2 time when calculating the primary and the secondary sum so here we will check in the secondary if i!=arr.length-1-i so if i==2 and 5-2-1=2=2 so this will not sum up!
        secondarySum+=arr[i][arr.length-i-1];
    }
    }
System.out.println("Primary Sum -->"+primarySum);
    System.out.println("Secondary Sum -->"+secondarySum);
    
       
}
    public static void main(String[] args) {
    int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    diagonalMatrixSum(arr);
    }
}
 */

//  spiral matrix
/*
public class Arrays {
public static void spiralMatrix(int arr[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = arr.length - 1;
    int endCol = arr[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
        // top
        for (int i = startCol; i <= endCol; i++) {
            System.out.print(arr[startRow][i] + " ");
        }

        // right
        for (int i = startRow + 1; i <= endRow; i++) {
            System.out.print(arr[i][endCol] + " ");
        }

        // bottom
        for (int i = endCol - 1; i >= startCol; i--) {
            if (startRow == endRow) break; // avoid duplicate row
            System.out.print(arr[endRow][i] + " ");
        }

        // left
        for (int i = endRow - 1; i > startRow; i--) {
            if (startCol == endCol) break; // avoid duplicate column
            System.out.print(arr[i][startCol] + " ");
        }

        startRow++;
        startCol++;
        endRow--;
        endCol--;
    }
    System.out.println();
}

    public static void main(String[] args) {
            int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            spiralMatrix(arr);
    }
}
     */


    //  questions for the matrix!

    // Q1 find the numbers 7 appear in the array
    /*
    public class Arrays {
    public static void countSeven(int arr[][]) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("Total times 7 appeare is --> "+count);
    }
        public static void main(String[] args) {
            int arr[][]={{4,7,8},{8,8,7}};
            countSeven(arr);
        }
    }
         */

        // Q2 find the sum for the 2nd row
        /*
        public class Arrays {
        public static void sumOfRow(int arr[][]) {
            int sum=0;
            for(int i=0;i<arr[0].length;i++){
                sum+=arr[1][i];
            }
            System.out.println("Sum of the 2nd row is --> "+sum);
        }
            public static void main(String[] args) {
                int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
                sumOfRow(arr);
            }
        }
             */

            //Q3 find the transpose of the matrix
            public class Arrays {

            
            public static void transpose(int arr[][]) {
    int transpose[][] = new int[arr[0].length][arr.length];

    // Fill transpose
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            transpose[j][i] = arr[i][j];
        }
    }

    // Print transpose
    for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[0].length; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }
}

                public static void main(String[] args) {
                    int arr[][]={{4,7,8},{8,8,7}};
                    transpose(arr);
                }
            } 