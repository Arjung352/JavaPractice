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
    public static int size;
    
    // Adding data in the linked List
    // there are two ways we can add data in the linked List
    // 1.Adding data from the front(addFirst)
    
    public void addFirst(int data) {
        // Step - 1
        // initializing the node in LL
        Node newNode=new Node(data);
        size++;
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
        size++;
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


// adding an element in a linked list
public void add(int idx,int data){
    // if its the only element in the linkedList
    if(idx==0){
        addFirst(data);
        return;
    }
    // initialized new variable for node tracking 
    Node temp=head;
    Node newNode=new Node(data);
    size++;
    int i=0;
    // loop to itrate till the desired index
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    // performing insertion
    newNode.next=temp.next;
    temp.next=newNode;
}


// removing an element at the first Node
public void removeFirst(){
    if(head==null){
        System.out.println("LinkedList is already empty");
        return;
    }
    else if(size==1){
        head=tail=null;
        size--;
        return;
    }
    head=head.next;
    size--;
} 


// removing an element at the last Node
public void removeLast(){
    if(head==null){
        System.out.println("LinkedList is already empty");
        return;
    }
    else if(size==1){
        head=tail=null;
        size--;
        return;
    }
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    prev.next=null;
    tail=prev;
    size--;
} 

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addLast(6);
        ll.print();
        ll.add(2, 3);
        ll.print();
        System.out.println(ll.size);
        ll.addFirst(2);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

    }
}