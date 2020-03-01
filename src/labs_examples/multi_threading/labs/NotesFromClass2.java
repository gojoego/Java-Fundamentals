package labs_examples.multi_threading.labs;

/*

Here's a few more examples of how to start new thread using a
class that implements Runnable. In this example we do not automatically
 create the Thread in the Runnable constructor but rather we rely on the
 user to create the Thread on their own and pass in the Runnable.

 */

public class NotesFromClass2 {
    public static void main(String[] args) {
        System.out.println("** Main Thread Start **");
        // Option 1 -
        // 1: create the Runnable
        // 2: then create the Thread and pass it the Runnable and a Thread name
        // 3: start the Thread
        MySecondRunnable runnable1 = new MySecondRunnable();
        Thread thread1 = new Thread(runnable1, "Option 1");
        thread1.start();


        // Option 2
        // 1: Create the Thread and pass in the Runnable on the fly in the constructor as well as a Thread name
        // 2: start the Thread
        Thread thread2 = new Thread(new MySecondRunnable(), "Option 2");
        thread2.start();


        // Option 3
        // since we don't need an object of the Thread class we can actually just do it like this
        // create the Thread and Runnable on the fly, pass in the name and start it all on one line
        new Thread(new MySecondRunnable(), "Option 3").start();
        System.out.println("** Main Thread End **");
    }
}


class MySecondRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try {
            for(int count=0; count<10; count++) {
                /* put this thread to sleep for 400 milliseconds */
                Thread.sleep(400);
                System.out.println("In " + Thread.currentThread().getName() + ", count is " + count);
            }
        }
        /* catch the potential exception */
        catch(InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " terminating.");
    }
}