package multithreading.ThreadMethods;

public class YieldDeep extends Thread{

    public void run(){
        for(int i = 0; i< 5; i++){
            System.out.println("Child Thread");
            if(i == 3){
              Thread.yield();
            }
        }
    }

    public static void main(String[] args)  throws InterruptedException{

        YieldDeep t = new YieldDeep();
        t.start();

      //  t.join(); 
        for(int i = 0;i<5 ;i++){
            System.out.println("Main thread");
            //Thread.sleep(200);
        }

        
    }
    
}
