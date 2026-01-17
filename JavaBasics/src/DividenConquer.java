public class DividenConquer {
// printing arrays
public static void printArr(int arr[]) {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();    
}
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
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}