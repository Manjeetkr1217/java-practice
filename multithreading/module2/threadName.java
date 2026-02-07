package multithreading.module2;

class mythread1 implements Runnable{
    public void run(){
        System.out.println("running thread: "+ 
            Thread.currentThread().getName());
    }
}
public class threadName {

    public static void main(String[] args) {
        Thread t = new Thread(new mythread1());
        t.setName("Child");
        t.start();

        Thread t1 = new Thread(new mythread1(), "child1");
        t1.start();
    }
    
}
