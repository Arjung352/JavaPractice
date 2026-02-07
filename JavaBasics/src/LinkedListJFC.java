import java.util.LinkedList;
public class LinkedListJFC {

    public static void main(String[] args) {
        // performing basic operations using JFC linked list
        // linked list creation
        LinkedList<Integer>ll=new LinkedList<>();
        // adding an element in the linked lists
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);
        // removing an element in the linked lists
        ll.removeLast();
        System.out.println(ll);

    }    
}
