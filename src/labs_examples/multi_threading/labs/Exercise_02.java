package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
class CovidOneNine extends Thread {

    CovidOneNine(String cases) {
        super(cases);
        start();
    }

    public void run() {
        System.out.println(getName() + " has more cases.");
        try {
            for(int count=0; count < 4336; count++) {
                Thread.sleep(10);
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

class ExtendThread {
    public static void main(String args[]) {
        System.out.println("patient zero in Wuhan");

        CovidOneNine globalCases = new CovidOneNine("South Korea");
        globalCases.setPriority(7);

        for(int i=0; i < 10; i++) {
            System.out.print("contagious");
            try {
                Thread.sleep(50);
            }
            catch(InterruptedException exc) {
                System.out.println("coronavirus spreading");
            }
        }

        System.out.println("outbreak contained");
    }
}