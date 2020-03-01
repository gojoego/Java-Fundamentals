package labs_examples.multi_threading.labs;

public class NotesFromClass3 {

    public static void main(String[] args) {

        // Step 1: demonstrate creating a new thread using the MyRunnable class below

        // Step 2: demonstrate create a new thread using the MyOtherRunnable class below

        System.out.println("Thread starts");
        MyRunnable thread1 = new MyRunnable("thread1");
        MyOtherRunnable thread2 = new MyOtherRunnable();
        System.out.println("Thread finishes");

    }
}

class MyRunnable implements Runnable {

    Thread thread;

    public MyRunnable(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("I'm in a thread name " + thread.getName() + "!");
    }

}

class MyOtherRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm in a thread name " + Thread.currentThread().getName() + "!");
    }
}

