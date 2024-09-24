package it.ciardi;

public class MyThread extends Thread{
    private int lun;

    public MyThread(int l){
        lun=l;
    }

    // devo assolutamente implementare la classe run quando estendo thread
    public void run(){
        // System.out.println("Ciao sono ; " + Thread.currentThread().getName());
        for (int i = 0; i < lun; i++) {
           System.out.println(Thread.currentThread().getName() + " : "+i);  
        }

    }
}
