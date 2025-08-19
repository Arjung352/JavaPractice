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
