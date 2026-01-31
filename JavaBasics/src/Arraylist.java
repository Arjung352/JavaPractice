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
    public static void maxElement(ArrayList<Integer> num) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.size();i++){
            max=Math.max(max, i);
        }
        System.out.println("Maximum element in this Arraylist is--> "+max);
    }
    public static void main(String[] args) {
    //  basicArraylistFunctions();
    ArrayList<Integer> nums=new ArrayList<>();
            for(int i=1;i<=10;i++){
            nums.add(i);
        }
        // reverseArraylist(nums);
        maxElement(nums);
    }
}