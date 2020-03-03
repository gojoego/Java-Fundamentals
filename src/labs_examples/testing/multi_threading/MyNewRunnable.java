package labs_examples.testing.multi_threading;

public class MyNewRunnable implements Runnable {

    Thread thread;

    public MyNewRunnable(String name){
        thread = new Thread(name);
        thread.start();
    }

    @Override
    public void run() {
        
    }
}
