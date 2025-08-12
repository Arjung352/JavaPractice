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