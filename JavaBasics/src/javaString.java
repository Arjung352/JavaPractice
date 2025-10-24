
/*public class javaString {
    public static void main(String[] args) {
        String str="abcd";
        String str2=new String("abcd");
        System.out.println(str);
        System.out.println(str2);
        // they are immutable
    }
}*/


// checking wheather the string is palindrome or not
/*
public class javaString {
    public static boolean checkPalindrome(String str){
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // finding if a string is a palindrome
        String str="arjun";
        System.out.println(checkPalindrome(str));
    }
}
     */

    //  shortest path to reach the destination

    public class javaString {
    public static double shortestPath(String str) {
        int len=str.length();
        int x=0;
        int y=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='w'){
                x--;
            }
            else if(str.charAt(i)=='e'){
                x++;
            }
            else if(str.charAt(i)=='n'){
                y++;
            }
            else {
                y--;
            }
        }
        double minDistance=Math.sqrt((x*x)+(y*y));
        return minDistance; 

    }
        public static void main(String[] args) {
            String str=new String("wneenesennn");
            System.out.println(shortestPath(str));            
        }
    }