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