package multithreading.ThreadMethods;

class InterruptDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread going to sleep");
            Thread.sleep(5000);
            System.out.println("Thread woke up normally");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while sleeping");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptDemo t = new InterruptDemo();
        t.start();

        Thread.sleep(2000); // main waits 2 sec
        t.interrupt();      // interrupt child
    }
}