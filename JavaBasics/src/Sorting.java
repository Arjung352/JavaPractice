// implimenting bubble sort
/*
public class Sorting {
    public static void bubbleSort(int arr[]) {
        // outter loop
        for(int i=0;i<arr.length-1;i++){
            // inner loop
            for(int j=0;j<arr.length-1-i;j++){
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
            System.out.print(arr[i]+" ");
        }
    }
 public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    bubbleSort(arr);
 }   
}
*/


//   selection sort
/*
public class Sorting {
    public static void selectionSort(int arr[]) {
        // outter loop
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        printArr(arr);
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
 public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    selectionSort(arr);
 }   
}

*/


// insertion sort
/*
public class Sorting {
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
    public static void main(String[] args) {
        int arr[]={4,2,5,1,3};
        insertionSort(arr);
    }
}
     */


     //  java inbuilt sorting function!
     /*
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        Integer arr[]={4,2,1,6,7,5,8,9};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr);

    }
}
     */


     //  bubble sort reverse
/*
    public class Sorting {
    public static void reverseBubbleSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            for(int j=arr.length-i;j>=i;j--){
                if(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        printArr(arr);
    }
public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
            int arr[]={4,2,5,1,3};
            reverseBubbleSort(arr);
        }
    }
         */

        //  reverse selection sort
/*
        public class Sorting {
    public static void selectionSort(int arr[]) {
        // outter loop
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        printArr(arr);
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
 public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    selectionSort(arr);
 }   
}
  */