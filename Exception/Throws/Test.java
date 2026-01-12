public class Test {

    public static void main(String[] args) throws InterruptedException {
        
        Thread.sleep(5000);
        
        try{
        Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
