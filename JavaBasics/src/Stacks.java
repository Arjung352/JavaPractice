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
/*
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
         */

    // Question - Push the data at the bottom
    
    public static void pushAtBottom(Stack<Integer> s,int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // work
        int top=s.pop();
        pushAtBottom(s, data);
        // backtrack
        s.push(top);
    } 
         
    // Question - Reverse the string using the Stacks
    /*
    public static void ReverseString(String str) {
        Stack<Character>s=new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result=new StringBuilder();
        while(!s.isEmpty()){
            result.append(s.pop());
        }
        System.out.println(result);
    }
         */
    // reversing the stack using reccursion for optimised approach
    /*
    public static void reverseStack(Stack<Integer>s) {
        // base case
        if(s.isEmpty()){
            return;
        }
        // reccursion calls
        int val=s.pop();
        reverseStack(s);
        // backtracking
        pushAtBottom(s,val);
    }
         */

    // stock span problem
    public static void stockSpan(int stock[],int span[]) {
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currPrice=stock[i];
            while(!s.empty()&&currPrice>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }

    // next greater element
    // using brute force O(n2)
    /*
    public static void nextGreater(int arr[]) {
    Stack<Integer> res = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
        boolean found = false;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                res.push(arr[j]);
                found = true;
                break;
            }
        }
        if (!found) {
            res.push(-1);
        }
    }
        while (!res.isEmpty()) {
        System.out.print(res.remove(0) + " ");
    }

}
     */

// using optimised approach using stacks
/*
    public static void nextGreater(int arr[]) {
        Stack<Integer>s=new Stack<>();
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.println(nextGreater[i]);
        }
    }
         */

    // valid paranthesis problem
    public static boolean validParanthesis(String str) {
        Stack<Character>s=new Stack<>();
        int len=str.length();
        for(int i=0;i<len;i++){
            Character ch=str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(str.charAt(i));
            }else{
                if (s.isEmpty()) {
                    return false;
                }
                char top = s.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
    // Stacks outer = new Stacks();
    // Stacks.Stack s = outer.new Stack();
    // using jfc(Java collection framework) in-built stacks
    Stack<Integer>s=new Stack<>();
    /*
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    System.out.println(s.peek());
    System.out.println(s.isEmpty());
    s.pop();
    s.pop();
    System.out.println();
     */

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    // pushAtBottom(s,0);
    // System.out.println("After reversing");
    // String str="racecar";
    // ReverseString(str);
    // System.out.println(s);
    // reverseStack(s); 
    // System.out.println(s);
    // while(!s.isEmpty()){
    //     System.out.println(s.peek());
    //     s.pop();
    // }
    /*
    int stocks[]={100,80,60,70,60,85,100};
    int span[]=new int[stocks.length];
    stockSpan(stocks, span);
    for(int i=0;i<span.length;i++){
        System.out.println(span[i]);
    }
         */
        int arr[]={6,8,0,1,3};
        // nextGreater(arr);
        System.out.println(validParanthesis("([](){})"));
    }
}
