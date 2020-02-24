package videos_source_code.oop.inheritance;

/**
 * Created by ryandesmond - https://codingnomads.co
 */


// this is a POJO
    // child class of Vehicle
    // can access Vehicle instance variables as if own

public class Sedan extends Vehicle {

    private double trunkCapacity;

    public Sedan(String make, String model, double miles, double trunkCapacity){
        super(make, model, miles);
        // will work because Vehicle class must exist before Sedan class created
        // when Sedan constructor called first thing must invoke super constructor and pass in arguments
        this.trunkCapacity = trunkCapacity;
        // "this"
    }

    @Override
    public boolean start() {
        System.out.println("starting sedan");
        return false;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
