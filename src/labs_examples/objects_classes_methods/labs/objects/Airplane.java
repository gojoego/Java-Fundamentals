package labs_examples.objects_classes_methods.labs.objects;

// this is the controller
class AirplaneController {

    public static void main(String[] args) {

        Capacity capacity = new Capacity(100);

        AircraftEngine engine = new AircraftEngine("Fast");

        Airplane bali = new Airplane(100, "Full", "United", "Texas", engine, capacity);

        System.out.println(bali.toString());

        // object composition


    }
}


class Airplane {

    double fuelCapacity;
    String currentFuelLevel;
    String airlineName;
    String baseCountry;
    AircraftEngine engine;
    Capacity capacity;

    public Airplane(double fuelCapacity, String currentFuelLevel, String airlineName, String baseCountry, AircraftEngine engine, Capacity capacity) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.airlineName = airlineName;
        this.baseCountry = baseCountry;
        this.engine = engine;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                ", airlineName='" + airlineName + '\'' +
                ", baseCountry='" + baseCountry + '\'' +
                ", engine='" + engine + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}


class Airline {

    String airlineName;
    String baseCountry;

    public Airline(String airlineName, String baseCountry) {

        this.airlineName = airlineName;
        this.baseCountry = baseCountry;

    }

    @Override
    public String toString() {
        return "Airline{" +
                "airlineName='" + airlineName + '\'' +
                ", baseCountry='" + baseCountry + '\'' +
                '}';
    }
}

class AircraftEngine {

    String engineSpeed;

    public AircraftEngine(String engineSpeed) {

        this.engineSpeed = engineSpeed;
    }

    @Override
    public String toString() {
        return "Engine {" +
                "engineSpeed='" + engineSpeed + '\'' +
                '}';
    }
}

class Capacity {

    long capacity;

    public Capacity(long capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "capacity=" + capacity +
                '}';
    }
}



