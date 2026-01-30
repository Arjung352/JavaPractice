public class Backtracking {
    // simple program of storing data in array using reccursion
    /*
    public static void arrDataSetter(int arr[],int i,int val) {
        if(i==arr.length){
            displayArrData(arr);
            return;
        }
        arr[i]=val;
        arrDataSetter(arr, i+1,val+1);
        // this is known as backtracking
        arr[i]=val-2;
    }
    public static void displayArrData(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
         */

    // Find subsets
    /*
        public static void findSubsets(String str,String ans,int i) {
            // base case
            if(i==str.length()){
                System.out.println(ans);
                return;
            }
            findSubsets(str, ans+str.charAt(i), i+1);
            findSubsets(str, ans, i+1);
        }
             */

        // Find permutations
        public static void findPermutation(String str,String ans) {
            if(str.length()==0){
                System.out.println(ans);
                return;
            }          
            for(int i=0;i<str.length();i++){
                char curr=str.charAt(i);
                String newStr=str.substring(0,i)+str.substring(i+1);
                findPermutation(newStr, ans+curr);
            }  
        }
    public static void main(String[] args) {
        int arr[]=new int[5];
        // arrDataSetter(arr, 0,1);
        // displayArrData(arr);
        String str="abcd";
        // findSubsets(str, "", 0);
        findPermutation(str, "");
    }
}
