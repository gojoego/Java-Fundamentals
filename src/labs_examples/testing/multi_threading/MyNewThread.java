package labs_examples.testing.multi_threading;

public class MyNewThread extends Thread {

    // constructor calls super
    // needs start
    public MyNewThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){

        for (int i = 0; i < 5; i ++)
        System.out.println(i + " - I'm in " + super.getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
