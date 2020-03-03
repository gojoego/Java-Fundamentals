package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */
class Exercise_05{

    public static void main(String[] args) {

    }

}

class Data {
    private String packet;
    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;

    public synchronized void send(String packet) {
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                Log.error("Thread interrupted", e);
            }
        }
        transfer = false;

        this.packet = packet;
        notifyAll();
    }

    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                Log.error("Thread interrupted", e);
            }
        }
        transfer = true;

        notifyAll();
        return packet;
    }
}

class Log{
    public static void error(String thread_interrupted, InterruptedException e) {
    }
}