package labs_examples.input_output.labs;

public class NotesFromClass3 {
        public static void main(String args[]) {
            System.out.println("** Main Thread Start **");
            MyFirstThread thread1 = new MyFirstThread("First Thread");
            thread1.setPriority(1);
            MyFirstThread thread2 = new MyFirstThread("Second Thread");
            thread2.setPriority(5);
            MyFirstThread thread3 = new MyFirstThread("Third Thread");
            thread3.setPriority(10);
            // notice when the next line prints
            System.out.println("** Main Thread End **");
        }
    }
    class MyFirstThread extends Thread {
        // Constructor for MyFirstThread
        // instead of implementing Runnable
        MyFirstThread(String name) {
            // pass the name of the thread to the super constructor
            super(name);
            // start the thread
            start();
            // direct access to Thread class methods
            // no need for Thread.start()
            // no need for object
        }
        // run() is called automatically after start() - this is overridden from the parent Thread class
        // the code in the run() method is what will be run as an independent thread
        @Override
        public void run() {
            System.out.println(getName() + " starting.");
            try {
                for(int count=0; count < 5; count++) {
                    Thread.sleep(400);
                    System.out.println("In " + getName() +
                            ", count is " + count);
                }
            }
            catch(InterruptedException exc) {
                System.out.println(getName() + " interrupted.");
            }
            System.out.println(getName() + " terminating.");
        }
    }


