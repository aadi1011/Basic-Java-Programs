import java.lang.Thread;
import java.lang.Runnable;

public class thread implements Runnable {
    public static void main(String[] args) {
        thread example = new thread();
        Thread thread = new Thread(example);
        thread.start();

        //methods
        System.out.println("Starting Main thread");
        System.out.println("New thread created!");
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread Priority: " + thread.getPriority());

        //Sleep
        try {
            System.out.println("Thread sleeping for two second");
            Thread.sleep(2000);
            System.out.println("Thread Awake!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Interrupt
        thread.interrupt();
        System.out.println("New Thread interrupted: " + thread.isInterrupted());

        //Thread priority
        thread.setPriority(4);
        System.out.println("Setting new priority for thread: " + thread.getPriority());

        //Yield
        Thread.yield();
        System.out.println("Thread Yielded!");

        try {
            thread.join();
            System.out.println("New thread complete.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ending Main Thread");
    }

    @Override
    public void run() {
        System.out.println("Running New Thread\n");
        try {
            System.out.println("Sleeping new thread");
            Thread.sleep(5000);
            System.out.println("-> New thread is awake!");
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
