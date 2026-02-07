//package multithreading.module3;

// ticket counter
class TicketCounter {
    int availableSeats = 5;

    // using synchronized keyword at method level and making the entire method
    // synchronized
    // so that at a time only one thread is able to access that thread
    // it is not a good way of avoiding race condition
    public void bookSeat(String userName) {
        synchronized (this) {
            System.out.println(userName + " is trying to book a seat");

            if (availableSeats > 0) {

                System.out.println(userName + "  -> " + availableSeats);
                availableSeats--;
              //  System.out.println(userName + " bookedSeat. Reamaining : " + availableSeats);
            } else {
                System.out.println(userName + " failed. No seats left");
            }
        }
    }
}

// booking task thread

class BookingTask implements Runnable {

    TicketCounter counter;
    String userName;

    BookingTask(TicketCounter counter, String userName) {
        this.counter = counter;
        this.userName = userName;

    }

    public void run() {
        counter.bookSeat(userName);
    }
}

public class synchronized1 {

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        Thread u1 = new Thread(new BookingTask(counter, "User-1"));
        Thread u2 = new Thread(new BookingTask(counter, "User-2"));
        Thread u3 = new Thread(new BookingTask(counter, "User-3"));
        Thread u4 = new Thread(new BookingTask(counter, "User-4"));
        Thread u5 = new Thread(new BookingTask(counter, "User-5"));
        Thread u6 = new Thread(new BookingTask(counter, "User-6"));
        Thread u7 = new Thread(new BookingTask(counter, "User-7"));
        Thread u8 = new Thread(new BookingTask(counter, "User-8"));

        u1.start();
        u2.start();
        u3.start();
        u4.start();
        u5.start();
        u6.start();
        u7.start();
        u8.start();

    }
}
