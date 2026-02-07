//package multithreading.module3;

final class Seat{
    private final int count;

    public Seat(int seat){
        this.count = seat;
    }
    public int getCount(){
        return count;
    }
    public Seat bookOne(){
        return new Seat(count - 1);
    }
}


class BookingTask implements Runnable{
    private Seat seat;

    BookingTask(Seat seat){
        this.seat = seat;
    }

    public void run(){
        seat = seat.bookOne();
        System.out.println(
            Thread.currentThread().getName() + 
            " remaining seats: "+ seat.getCount()
        );
    }

}


public class immutable1 {

    public static void main(String[] args) {

        Seat initialSeat = new Seat(5);

        Thread t1 = new Thread(new BookingTask(initialSeat), "user-1");
        t1.start();
        Thread t2 = new Thread(new BookingTask(initialSeat), "user-2");
        t2.start();
         Thread t3 = new Thread(new BookingTask(initialSeat), "user-3");
        t3.start();
         Thread t4 = new Thread(new BookingTask(initialSeat), "user-4");
        t4.start();
         Thread t5 = new Thread(new BookingTask(initialSeat), "user-5");
        t5.start();
    }
    
}
