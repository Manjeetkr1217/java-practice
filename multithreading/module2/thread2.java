package multithreading.module2;

import java.lang.Thread;

class mythread implements Runnable{
    public void run(){
        for(int i =0; i<10;i++){
            System.out.println("child thread");
        }
    }
}

public class thread2 {

    public static void main(String[] args) {
        
        for(int i =0; i<10;i++){
            System.out.println("main thread");
        }
        mythread obj1  = new mythread();
        Thread t1 = new Thread(obj1);
        t1.start();
    }
    
}
