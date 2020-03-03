package labs_examples.testing.coronavirus;

public class VirusController {

    public static void main(String[] args) {

        ExtendsVirus virusCases = new ExtendsVirus("Macau");
        ExtendsVirus2 virusCases2 = new ExtendsVirus2("Hong Kong");
        ExtendsVirus3 virusCases3 = new ExtendsVirus3("Iran");


        ImplementsVirus virusTravel = new ImplementsVirus("Cruises");
        ImplementsVirus2 virusTravel2 = new ImplementsVirus2("Airplanes");
        ImplementsVirus3 virusTravel3 = new ImplementsVirus3("Train");
        virusTravel3.thread.run();

    }
}
