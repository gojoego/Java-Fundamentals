package labs_examples.inheritance.labs;

public class MethodOverridingExample {

}
// parent class Vehicle
class Vehicle {
    int mpg;
    int fuel_capacity;
    String type;


    // parent method start()
    public void start(){
        System.out.println("Vehicle starting...");

        // do steps to start a vehicle ie,

        // push clutch with left foot
        // turn key with right hand
        // give a little gas with right foot
    }
}


// child class Motorcycle
class Motorcycle extends Vehicle {
    Motorcycle(){
        mpg = 30;
        fuel_capacity = 10;
        type = "motorcycle";
    }

    // the method below overrides the behavior of the start() method in the Vehicle class
    @Override
    public void start(){
        System.out.println("Motorcycle starting...");
        // do steps to start a motorcycle
        // lift kick stand
        // compress clutch with left hand
        // push ignition buttom with right thumb
        // slightly twist throttle with right hand
    }
}


class OverrideDemo {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        // we can instantiate a new Motorcycle as a Vehicle as seen below
        // we could also say Motorcycle moto = new Motorcycle(); they will both work
        Vehicle moto = new Motorcycle();
        // now invoke the start() method on the Motorcycle
        // which overrides the start() method in the Vehicle class
        moto.start();
        // now invoke the start() method on the Vehicle object
        // (which will call the start() method in the Vehicle class)
        vehicle.start();
    }
}
/*
Notice how both classes are of type Vehicle.
But the moto object we created actually uses the subclass Motorcycle.
When we call the start() method on the "vehicle" object it uses the
start() method in the Vehicle class. When we call the start() method on
the "moto" object it uses the start() method in the Motorcycle class.
This is an example of method overriding, which is polymorphism in action.
 */