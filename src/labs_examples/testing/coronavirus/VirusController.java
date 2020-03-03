package labs_examples.testing.coronavirus;

public class VirusController {

    public static void main(String[] args) {


        // three objects that are Threads created from three different classes that extend
        // the Thread class as opposed to implementing
        ExtendsVirus virusCases = new ExtendsVirus("Macau");
        ExtendsVirus2 virusCases2 = new ExtendsVirus2("Hong Kong");
        ExtendsVirus3 virusCases3 = new ExtendsVirus3("Iran");

        // three objects that are Threads created from three different classes
        // that implement the Runnable interface
        ImplementsVirus virusTravel = new ImplementsVirus("Cruises");
        ImplementsVirus2 virusTravel2 = new ImplementsVirus2("Airplanes");

        ImplementsVirus3 virusTravel3 = new ImplementsVirus3();
        Thread thread = new Thread(virusTravel3, "Foot");
        thread.start();

    }
}
