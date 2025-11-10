
// Multithreading means running multiple parts of a program (threads) concurrently so they appear to execute simultaneously.

// Each thread is a lightweight sub-process that runs within the same program and shares memory.


class MyThread extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("From MyThread: " + (i+1));
        }
    }    
}

public class MultiThread {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println("From main: " + (i+1));
        }
    }
}
