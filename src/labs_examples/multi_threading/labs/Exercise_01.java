package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing
 *      the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread
 *      using the Runnable you just created
 *
 */

class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("disease outbreak");
        Coronavirus contagious1 = new Coronavirus("By boat");
        contagious1.thread.setPriority(10);
        Coronavirus contagious2 = new Coronavirus("By airplane");
        contagious2.thread.setPriority(5);
        Coronavirus contagious3 = new Coronavirus("By foot");
        System.out.println("disease contained");
        contagious3.thread.setPriority(1);

        contagious1.thread.getName();
        contagious2.thread.getName();
        contagious3.thread.getName();

    }
}

class Coronavirus implements Runnable {

    Thread thread;

    public Coronavirus(String transport) {
        thread = new Thread(this, transport);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " is how it is spreading.");
        try {
            for (int count = 0; count < 5; count++) {
                Thread.sleep(1000,1000);
                System.out.println("The coronavirus is spreading" );
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " is how it is spreading");
        }
        System.out.println(thread.getName() + " is how it is spreading");
    }
}
