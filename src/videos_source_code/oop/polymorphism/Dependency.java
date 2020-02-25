package videos_source_code.oop.polymorphism;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Dependency {

    MotorizedTransport transport;
    // using interface as a class
    // dependency injection
    // but this is an interface
    // any class that implements this interface will work as transport variable

    public Dependency(MotorizedTransport transport) {
        this.transport = transport;
    }

    public void testMethods(){
        transport.start();
        transport.accelerate(20);
        transport.stop();
        System.out.println("--------------------------");
    }

    public void setTransport(MotorizedTransport transport) {
        this.transport = transport;
    }
}
