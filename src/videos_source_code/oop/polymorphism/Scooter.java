package videos_source_code.oop.polymorphism;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Scooter implements MotorizedTransport {
    // interface

    @Override
    public boolean start() {
        System.out.println("start scooter");
        return false;
    }

    @Override
    public void stop() {
        System.out.println("stopping scooter");
    }

    @Override
    public void accelerate(double mph) {
        System.out.println("accelerating scooter");
    }

    @Override
    public void decelerate(double mph) {
        System.out.println("decelerating scooter");
    }
}


// overloading, overriding, and using interfaces as dependencies - polymorphism
// interfaces - 3 diff classes, call same methods, act in slightly diff ways