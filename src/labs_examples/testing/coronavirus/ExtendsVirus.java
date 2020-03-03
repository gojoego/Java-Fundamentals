package labs_examples.testing.coronavirus;

public class ExtendsVirus extends Thread {

    public ExtendsVirus(String name) {

        super(name);
        start();

    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In " + getName() +
                    ", count is " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("outbreak contained" );
                ;
            }
        }
    }
}

class ExtendsVirus2 extends Thread{

    public ExtendsVirus2(String name){
        super(name);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("In " + getName() +
                    ", the count of confirmed Coronavirus cases has reached " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("outbreak contained");
                ;
            }
        }
    }

}

class ExtendsVirus3 extends Thread{

    public ExtendsVirus3(String name){
        super(name);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("In " + getName() +
                    ", the number of cases is now " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("outbreak contained");
                ;
            }
        }
    }

}