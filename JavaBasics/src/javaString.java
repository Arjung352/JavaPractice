
/*public class javaString {
    public static void main(String[] args) {
        String str="abcd";
        String str2=new String("abcd");
        System.out.println(str);
        System.out.println(str2);
        // they are immutable
    }
}*/

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