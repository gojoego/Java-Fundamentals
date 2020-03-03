package labs_examples.testing.coronavirus;

/*

implementing Runnable hints:
public MyNewRunnable(String name){
    thrd = new Thread(this, name);
    thrd.start();

 */

public class ImplementsVirus implements Runnable {

    Thread thread;

    public ImplementsVirus(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {

        try {
            for (int count = 0; count < 100; count++) {
                Thread.sleep(1000);
                System.out.println("The coronavirus is moving around the world by " + thread.getName());
            }
        } catch (InterruptedException exc) {
            System.out.println("vaccine found");
        }
    }
}


class ImplementsVirus2 implements Runnable {

    Thread thread;

    public ImplementsVirus2(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
    @Override
    public void run() {

        try{
            for (int x = 0; x < 100; x++){
                Thread.sleep(100);
                System.out.println("The coronavirus is spreading by " + thread.getName());
            }
        } catch (InterruptedException exc){
            System.out.println("vaccine found");
        }

    }
}


class ImplementsVirus3 implements Runnable {

    @Override
    public void run() {

        try{
            for (int y = 0; y < 100; y++){
                Thread.sleep(10);
                System.out.println("COVID19 is dispersing");
            }
        } catch (InterruptedException exc){
            System.out.println("vaccine found");
        }

    }
}
