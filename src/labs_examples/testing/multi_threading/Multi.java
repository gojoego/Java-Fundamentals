package labs_examples.testing.multi_threading;

public class Multi  {

    public static void main(String[] args) throws InterruptedException {
        MyNewThread mnt1 = new MyNewThread("Vespa Thread");

        MyNewThread mnt2 = new MyNewThread("Vario Thread");
        mnt1.join();
        // cannot go forward until Vario and Vespa threads complete

        System.out.println(mnt1.getName() + " has rejoined the main thread");
        mnt2.join();

        System.out.println(mnt2.getName() + " has rejoined the main thread");

        MyNewThread mnt3 = new MyNewThread("Scoopy Thread");
        mnt3.join();

        System.out.println("main() complete");
    }

}
