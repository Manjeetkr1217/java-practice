public class Case2 {

    public static void main(String[] args) throws InterruptedException {
        doStuff();
    }
    public static void doStuff() {
        doMoreStuff();
    }
    public static void doMoreStuff() {
        Thread.sleep(5000);
    }

    
}
