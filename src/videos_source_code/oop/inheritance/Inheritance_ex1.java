package videos_source_code.oop.inheritance;

public class Inheritance_ex1 {


    class Car {
        String make;
        String model;
        public void drive(int distance){
            // some action(s) to drive the car
        }
    }

    class SportsCar extends Car {
        boolean hasRaceTires;
        boolean hasSpoiler;

    }

    class CarDemo {
        public void main(String[] args){
            SportsCar ferrari = new SportsCar();
            //below we are using the "make" variable which is defined in Car
            ferrari.make = "Ferrari";
            //below we are using the "model" variable which is defined in Car
            ferrari.model = "599 XX";
            //below we are using the "hasSpoiler" variable which is defined in SportsCar
            ferrari.hasSpoiler = true;
            //below we are using the "hasRaceTires" variable which is defined in SportsCar
            ferrari.hasRaceTires = true;
            //below we are using the "drive()" method which is defined in Car
            ferrari.drive(20);

            //...
        }
    }
}
