class TickTock {
    synchronized void tick() {
        System.out.print("Tick ");
        notify();  // Notify waiting thread (tock()) that tick() is done
        try {
            wait();  // Wait for tock() to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void tock() {
        System.out.println("Tock");
        notify();  // Notify waiting thread (tick()) that tock() is done
        try {
            wait();  // Wait for tick() to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TickTockExample {
    public static void main(String[] args) {
        TickTock clock = new TickTock();

        // Thread for tick()
        Thread tickThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                clock.tick();
            }
        });

        // Thread for tock()
        Thread tockThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                clock.tock();
            }
        });

        // Start the threads
        tickThread.start();
        tockThread.start();

        // Wait for threads to complete
        try {
            tickThread.join();
            tockThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
