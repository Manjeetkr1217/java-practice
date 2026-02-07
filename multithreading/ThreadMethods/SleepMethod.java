package multithreading.ThreadMethods;

public class SleepMethod extends Thread{
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

    public static void main(String[] args) {

        SleepMethod t = new SleepMethod();
        t.start();

        for(int i = 0;i<5 ;i++){
            System.out.println("Main thread");
        }

        
    }
    
}
