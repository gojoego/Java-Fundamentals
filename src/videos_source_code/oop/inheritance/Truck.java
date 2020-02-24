package videos_source_code.oop.inheritance;

/**
 * Created by ryandesmond - https://codingnomads.co
 *
 *
 *
 */

// this is a POJO
    // child class of Vehicle - can access Vehicle variables as if they belonged to Truck

public class Truck extends Vehicle{

    private double bedCapacity;
    // private instance variable

    public Truck(String make, String model, double miles, double bedCapacity) {
        super(make, model, miles);
        this.bedCapacity = bedCapacity;
        // both "super" and "this" used
        // "this" in this class, variable or method
    }

    @Override
    public boolean start() {
        System.out.println("starting truck");
        return false;
    }

    public double getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(double bedCapacity) {
        this.bedCapacity = bedCapacity;
    }
}
