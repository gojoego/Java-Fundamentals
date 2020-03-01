package labs_examples.multi_threading.labs;


/**
 * Implement the Runnable interface in the class below.
 * <p>
 * Make the run method print "Hello MultiThreading!" name
 * every 100 milliseconds, 10 times, each time on a new line.
 * <p>
 * Hints:
 * Make sure to use a try catch inside the run method to
 * catch any InterruptedExceptions.
 * <p>
 * Implement the Runnable interface
 * <p>
 * Methods to use:
 * <p>
 * super();
 * start();
 * Thread.sleep();
 */

//    1. Create a reference to Thread
class CodingChallengeIR {
    public static void main(String[] args) {

        MultiThreading thread = new MultiThreading();

        thread.multiThreading();
    }
}

class MultiThreading implements Runnable {

    Thread thread;

    public void multiThreading() {

        //2. Initialize the thread reference with a parameter of 'this'
        //3. Start the thread.

        thread = new Thread(this);
        thread.start();
    }

    // 4.Override the run() method
    @Override
    public void run() {

        //5. Make run() print 'Hello Multithreading 10 times, once every 100ms'
        //6. Catch any InterruptedExceptions
        for (int count = 0; count < 10; count++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello MultiThreading!" + count);
        }
    }
}

