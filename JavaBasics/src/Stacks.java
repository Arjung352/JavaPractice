import java.util.Stack;

public class Stacks {
    /*
    // made stacks using arrays!
    public class Stack{
        int arr[]=new int[10];
        // to perform all the operations on the stack
        int top=-1;
        // performing push operation in stacks using arrays
        public void push(int data){
        // checking if the stack is full or not
            if(top==arr.length-1){
                System.out.println("Stack Overflow!");
                return;
            }
            top++;
            arr[top]=data;
        }
        // performing pop operation in stacks using arrays
        public void pop(){
        // checking if the stack is empty or not
        if(isEmpty()){
            System.out.println("Stack UnderFlow!");
            return;
        }
        System.out.println(arr[top]);
        top--;
        }
        // performing peek operation in stacks using arrays
        public void peek(){
         if(isEmpty()){
            System.out.println("Stack Empty!");
            return;
        }   
        System.out.println(arr[top]);
        }
        public boolean isEmpty(){
            if(top==-1){
                return true;
            }
            else{
                return false;
            }
        }
        public void print(){
            int temp=top;
            while(temp>=0){
                System.out.println(arr[temp]);
                temp--;
            }
        }
    }
         */

    // Stacks using Linked List
    public class Stack{
        public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static int size;
        public void push(int data){
            if(isEmpty()){
                Node newNode=new Node(data);
                size++;
                head=newNode;
                return;
            }
            // there's no overflow problem in stacks using linked list
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            size++;
        }
        public void pop(){
            if(isEmpty()){
                System.out.println("Stack UnderFlow!");
                return;
            }
            head=head.next;
            size--;
        }
        public void peek(){
            if(isEmpty()){
                System.out.println("Stack empty!");
                return;
            }
            System.out.println(head.data);
        }
        public boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public void print(){
                    Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        }
    }
    public static void main(String[] args) {
    Stacks outer = new Stacks();
    Stacks.Stack s = outer.new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    s.peek();
    System.out.println(s.isEmpty());
    s.pop();
    s.pop();
    System.out.println();
    s.print();
    }
}
