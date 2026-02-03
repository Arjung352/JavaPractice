public class LinkedList {
public class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        this.next=null;        
    }
}
    public static Node head;
    public static Node tail;
    
    // Adding data in the linked List
    // there are two ways we can add data in the linked List
    // 1.Adding data from the front(addFirst)
    
    public void addFirst(int data) {
        // Step - 1
        // initializing the node in LL
        Node newNode=new Node(data);
        // Step - 2
        // then we'll check weather its an only node in the LinkedList
        if(head==null){
            head=tail=newNode;
            return;
        }
        // if there are other data in the linkedList than we'll link them and relocate the head
        // Step - 3
        // set next to the current head
        newNode.next=head;
        // Step - 4
        // Now relocate the head
        head=newNode;

    }

    // 2.Adding data from the End(addLast)
    public void addLast(int data){
        // Step - 1
        // initializing the node in LL
        Node newNode=new Node(data);
        // Step - 2
        // then we'll check weather its an only node in the LinkedList
        if(head==null){
            head=tail=newNode;
            return;
        }
        // if there are other data in the linkedList than we'll link them and relocate the tail
        // Step - 3
        // set next to the current tail
        tail.next=newNode;
        // Step - 4
        // Now relocate the tail
        tail=newNode;
}
    

// Printing a Linked List
public void print(){
    // initializing a temp variable with the address of head
    Node temp=head;
    // looping the temp through the linked List till the temp != null
    while(temp!=null){
        // printing the data
        System.out.print(temp.data+"->");
        // moving the temp forward
        temp=temp.next;
    } 
    System.out.println("Null");
}
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
    }
}