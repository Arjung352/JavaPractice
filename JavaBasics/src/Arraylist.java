import java.util.ArrayList;
public class Arraylist {
    /*
    public static void basicArraylistFunctions() {
        ArrayList<Integer> nums=new ArrayList<>();
        // Time complexity of adding an element in arraylist is O(1)
        for(int i=1;i<=10;i++){
            nums.add(i);
        }
        System.out.println(nums);
        // Time complexity of getting an element in arraylist is O(1)
        int num=nums.get(4);
        System.out.println(num);
        // Time complexity of removing an element in arraylist is O(n)
        nums.remove(4);
        System.out.println(nums);
        // Time complexity of setting an element in arraylist is O(n)
        nums.set(8, 5);
        System.out.println(nums);
        // Time complexity of checking if an element is in arraylist is O(n)
        System.out.println(nums.contains(num));
        System.out.println(nums.contains(10));
    }
         */
        // reverse of an arraylist
        /*
        public static void reverseArraylist(ArrayList<Integer> num) {
            for(int i=num.size()-1;i>=0;i--){
                System.out.print(num.get(i)+" ");
            }
        }
             */
    
    // finding maximum element in arraylist
    /*
    public static void maxElement(ArrayList<Integer> num) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.size();i++){
            max=Math.max(max, i);
        }
        System.out.println("Maximum element in this Arraylist is--> "+max);
    }
         */
    
    // multidimmensional ArrayLists
    /*
    public static void multidimmensionalArrayList() {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> nums1=new ArrayList<>();
        ArrayList<Integer> nums2=new ArrayList<>();
        ArrayList<Integer> nums3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            nums1.add(i);
            nums2.add(i*2);
            nums3.add(i*3);
        }
        mainList.add(nums1);
        mainList.add(nums2);
        mainList.add(nums3);
        // printing the mainlist
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curr=mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
         */

    // container with most water using brute force- time complexity O(n^2)
    /*
    public static void containerWithMostWater(int arr[]) {
        int maxWater=0;
        // outter loop
        for(int i=0;i<arr.length;i++){
            // inner loop
            for(int j=i+1;j<arr.length;j++){
                int height=Math.min(arr[i], arr[j]);
                int waterContained=(j-i)*height;
                maxWater=Math.max(maxWater, waterContained);
                }
                }
                System.out.println("max water will be->"+maxWater);
                }
                */
    
    
    // more optimised approach 2 pointers
    /*
    public static void containerWithMostWater(int arr[]) {
        // setting pointers
        int left=0;
        int right=arr.length-1;
        int maxWater=0;
        while(left<right){
            int containerHeight=Math.min(arr[left],arr[right]);
            int width=right-left;
            int currWater=containerHeight*width;
            maxWater=Math.max(maxWater, currWater);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("max water will be->"+maxWater);

    }
 */

    //  pair sum
    // using brute force resulting in time complexity of O(n)
    /*
    public static boolean twoSum(int arr[],int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(target==(arr[i]+arr[j])){
                return true;
            }
        }
        }    
    return false;
    }
    */
    // using more optimised approach - twoPointers 
    /*   
     public static boolean twoSum(int arr[],int target) {
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            if(target==(arr[left]+arr[right])){
                return true;
                }
                else{
                    if(target<(arr[left]+arr[right])){
                right--;
                }
                else{
                    left++;
            }
            }
            }
            return false;
            }
            */
           
//  two sum-2(need to search in roated and sorted array)
        public static boolean twoSum(int arr[],int target) {
            int bp=-1;
            int n=arr.length;
            // finding breaking point
            for(int i=0;i<arr.length;i++){
                if(arr[i]>arr[i+1]){
                    bp=i;
                    break;
                }
            }
            // initializing pointers
            int left=bp+1;//smallest element
            int right=bp;//largest element
            while(left!=right){
                if((arr[left]+arr[right])==target){
                    return true;
                }
                else{
                    if((arr[left]+arr[right])<target){
                        left=(left+1)%n;
                    }
                    else{
                        right=(n+right-1)%n;
                    }
                }
            }
            return false;
        }

    public static void main(String[] args) {
    //  basicArraylistFunctions();
    ArrayList<Integer> nums=new ArrayList<>();
        //     for(int i=1;i<=10;i++){
        //     nums.add(i);
        // }
        // reverseArraylist(nums);
        // maxElement(nums);
        // multidimmensionalArrayList();
        int arr[] = {11,15,6,8,9,10};
        // int arr[]=new int[10];
        System.out.println(twoSum(arr,16));
        // containerWithMostWater(height);
    }
}