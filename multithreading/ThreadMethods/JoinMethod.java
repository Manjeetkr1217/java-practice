package multithreading.ThreadMethods;

public class JoinMethod extends Thread{
    public void run(){
        for(int i = 0; i< 5; i++){
            System.out.println("Child Thread");
           
                try{
                Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Thread interrupted");
                }
            
        }
    }

    public static void main(String[] args)  throws InterruptedException{

        SleepMethod t = new SleepMethod();
        t.start();

        t.join(); // main thread waits
        for(int i = 0;i<5 ;i++){
            System.out.println("Main thread");
        }

        
    }
    
}
