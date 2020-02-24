package videos_source_code.oop.polymorphism;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public interface MotorizedTransport {

    public boolean start();
    // abstract method

    public void stop();
    // just a method signature

    public void accelerate(double mph);
    // no method body

    public void decelerate(double mph);
    // acts as a contract
    // any class that implements needs to implement these methods

}
