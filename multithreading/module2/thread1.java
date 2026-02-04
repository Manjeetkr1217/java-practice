package multithreading.module2;
class mythread extends Thread{
    public void run(){
        for(int i =0; i<10;i++){
            System.out.println("mythread");
        }
    }

}

public class thread1 {

    public static void main(String[] args) {

        mythread t = new mythread();
        t.start();
         for(int i =0; i<10;i++){
            System.out.println("main thread");
        }

        
        
    }
    
}
