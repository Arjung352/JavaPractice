public class DividenConquer {
// printing arrays
public static void printArr(int arr[]) {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();    
}
/*
// merge sort
public static void mergeSort(int arr[],int start,int end) {
    // base case
    if(start>=end){
        return;
    }
    int mid=start+(end-start)/2;
    mergeSort(arr, start, mid);//left 
    mergeSort(arr, mid+1, end);//right
    merge(arr,start,end,mid);
}
public static void merge(int arr[],int start,int end,int mid) {
    // initializing an empty array
    int temp[]=new int[end-start+1];
    // initializing itrators
    int i=start;//left
    int j=mid+1;//right
    int k=0;
    while(i<=mid&&j<=end){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
    }
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    while(j<=end){
        temp[k++]=arr[j++];
    }
// copy temp to orignal arr
for(k=0,i=start;k<temp.length;k++,i++){
    arr[i]=temp[k];
}
}
*/
/*
public static void quickSort(int arr[],int start,int end) {
    if(start>=end){
        return;
    }
    int pidx=partition(arr,start,end);
    quickSort(arr, start, pidx-1);
    quickSort(arr, pidx+1, end);
}
public static int partition(int arr[],int start,int end) {
    int pivot=arr[end];
    int i=start-1;
    for(int j=start;j<end;j++){
        if(arr[j]<=pivot){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
    i++;
    int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
}
         */
public static int searchRotatedSortedArr(int arr[],int target,int start,int end) {
    if(start>end){
        return -1;
    }
    int mid =start+(end-start)/2;
    if(arr[mid]==target){
        return mid;
    }
    if(arr[start]<=arr[mid]){
        if(arr[start]<=target&&target<=arr[mid]){
            return searchRotatedSortedArr(arr, target, start, mid);
        }
        else{
            return searchRotatedSortedArr(arr, target, mid+1, end);
        }
    }
    else{
        if(arr[mid]<=target&&target<=arr[end]){
        return searchRotatedSortedArr(arr, target, mid+1, end);
    }
    else{
        return searchRotatedSortedArr(arr, target, start, mid-1);
    }
}
}
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        // mergeSort(arr, 0, arr.length-1);
    //    quickSort(arr, 0, arr.length-1); 
        // printArr(arr);
        int result=searchRotatedSortedArr(arr, 0, 0, arr.length-1);
        System.out.println(result);
    }
}