package videos_source_code.oop.inheritance;


import videos_source_code.oop.polymorphism.MotorizedTransport;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

// created because Truck and Sedan had 3 variables or traits that they shared
// took abstracted 3 traits and placed them into a parent class
// Truck and Sedan now extend Vehicle
    // example of Inheritance and Abstraction
// now just need to define what make Truck and Sedan unique

public abstract class Vehicle implements MotorizedTransport {

    protected String make;
    protected String model;
    protected double miles;
    public final double PI = 3.1417;

    public Vehicle(){}
    // default constructor
    // subclasses can automatically create it
    // with no default constructor, you cannot invoke
    // constructors in the subclasses

    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

    @Override
    public void stop() {
        System.out.println("stopping vehicle");

    }

    @Override
    public void accelerate(double mph) {
        System.out.println("accelerating vehicle");


    }

    @Override
    public void decelerate(double mph) {
        System.out.println("decelerating vehicle");

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
