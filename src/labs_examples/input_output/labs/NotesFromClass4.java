package labs_examples.input_output.labs;

/*

In the example below, we create a Thread object named thrd.
We start that thread and then we invoke the join() method on that object.
By doing this, the main thread will wait until thrd completes before moving forward.
This is very helpful when we want to use multi-threading to complete a number of
non-sequential tasks, but then need to do something in sequential order once those
threads complete. thrd.join() will make sure that thrd is terminated before moving
forward with the program.

 */


public class NotesFromClass4 {
}
// This is a class that implements Runnable - it's a thread
class Priority implements Runnable {
    int count;
    /* create the Thread object that will manage the thread */
    Thread thrd;
    static boolean stop = false;
    static String currentName;
    int id = 0;
    /* Construct a new thread. Notice that this
       constructor does not actually start the
       threads running. */
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
        /* Notice that we do not start the thread in the constructor this time.
           The choice is yours. If you do not start the thread (thrd.start()) here in the constructor,
           then you must manually start it from the controlling class.
           See "mt1.thrd.start();" in the PriorityDemo class below */
    }

    /* Begin execution of new thread. */
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 10000000);
        stop = true;
        System.out.println("\n" + thrd.getName() +
                " terminating.");
    }
}

class PriorityDemo {
    public static void main(String args[]) {
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");

        /* set the priorities */
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        /* start the threads */
        mt1.thrd.start();
        mt2.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("\nHigh priority thread counted to " +
                mt1.count);
        System.out.println("Low priority thread counted to " +
                mt2.count);
    }
}