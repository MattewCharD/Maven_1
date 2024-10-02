package it.ciardi;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //int l = 15;
        MyThread t1 = new MyThread(/*l*/);
        MyThread t2 = new MyThread(/*l*/);
        // t1.run(); no
        Thread t3 = new Thread(t2);
        Thread t4 = new Thread(t1);
        // t1.start();
        // t2.start();
        t3.start();
        t4.start();
        t3.join();
        System.out.println("ho finito ");
        t4.join();
        System.out.println("pure io");
        // for (int i = 0; i < 10; i++) {
        //   System.out.println(Thread.currentThread().getName() + " : "+i);  
        // }
        System.out.println("Hello world!");
        
        
    }
}