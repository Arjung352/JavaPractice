import java.util.*;
import java.util.LinkedList;
public class QueueB {
    static class MyQueue{
        static int arr[];
        static int size;
        static int rear;
        MyQueue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        // isEmpty
        public static boolean isEmpty(){
            return rear==-1;
        }
        // add O(1)
        public static void add(int data) {
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        // remove O(N)
        public static int remove() {
            if(isEmpty()){
                System.out.println("Queue already empty");
                return -1;
            }
            int front=arr[0];
            // shifting every element in the queue by 1 place to front to remove the front
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        // peek O(1)
        public static int peek() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    static class CircularQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        CircularQueue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        // isEmpty
        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        public static boolean isFull(){
             return (rear+1)%size==front; 
        }
        // add O(1)
        public static void add(int data) {
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // adding first element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        // remove O(1)
        public static int remove() {
            if(isEmpty()){
                System.out.println("Queue already empty");
                return -1;
            }
            int result=arr[front];
            // if there's only 1 element in the queue
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        // peek O(1)
        public static int peek() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    // Queue using linkedList
        public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class LinkedListQueue{
        static int size;
        static Node head=null;
        static Node tail=null;

        // isEmpty
        public static boolean isEmpty(){
            return head==null&&tail==null;
        }
        
        // add O(1)
        public static void add(int data) {
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                size++;
                return;
            }
            tail.next=newNode;
            tail=newNode;
            size++;
        }
        // remove O(1)
        public static int remove() {
            if(isEmpty()){
                System.out.println("Queue already empty");
                return -1;
            }
            int result=head.data;
            // if there's only 1 element in the queue
            if(head==tail){
                head=tail=null;
                size--;
            }
            else{
                head=head.next;
                size--;
            }
            return result;
        }
        // peek O(1)
        public static int peek() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
     static class QueueUsingStack{
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        // add operation
        public static void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        // remove operation
    }
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is already empty");
                return -1;
            }
            return s1.pop();
        }

        // peek
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is already empty");
                return -1;
            }
            return s1.peek();
        }
    }
    static class StackUsingQueue{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        public static boolean isEmpty(){
            return (q1.isEmpty()&&q2.isEmpty());
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("The Stack is empty");
                return -1;
            }
            int top=-1;
            // case 1 where the data is stored in q1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
                else{
                    while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
    }
    public static int peek(){
        if(isEmpty()){
                System.out.println("The Stack is empty");
                return -1;
            }
            int top=-1;
            // case 1 where the data is stored in q1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }
            // case 2 where the data is stored in q2
                else{
                    while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
    }
}
    public static void main(String[] args) {
        // LinkedListQueue queue = new LinkedListQueue();
        // Queue using JFC there are 2 ways to create a Queue :Using linkedList and lastlty using arrayDeque
        // Queue<Integer> queue=new LinkedList<>();
        /*
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.remove());
        queue.add(40);
        System.out.println(queue.remove());
        queue.add(50);
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
             */
            /*
        QueueUsingStack customQueue=new QueueUsingStack();
        System.out.println(customQueue.isEmpty());
        customQueue.peek();
        customQueue.remove();
        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);
        System.out.println(customQueue.remove());
        System.out.println(customQueue.peek());
        System.out.println(customQueue.isEmpty());
         */
        StackUsingQueue customStack=new StackUsingQueue();
        customStack.peek();
        customStack.pop();
        System.out.println(customStack.isEmpty());
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        System.out.println(customStack.peek());
        System.out.println(customStack.isEmpty());

    }
}
