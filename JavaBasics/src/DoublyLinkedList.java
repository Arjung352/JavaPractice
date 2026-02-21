public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // AddFirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    // AddLast
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    // removeFirst
    public void removeFirst(){
        if(head==null){
            System.out.println("Linked List was empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    // removeLast
    public void removeLast(){
        if(head==null){
            System.out.println("Linked List was empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            System.out.print("<-->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.addLast(5);
        dll.addLast(6);
        dll.addLast(7);
        System.out.println();
        dll.print();
        System.out.println(dll.size);
        System.out.println("Removing the last element");
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
        System.out.println("Removing the last element");
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
        
    }
}
