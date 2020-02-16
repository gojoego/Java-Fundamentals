package labs_examples.objects_classes_methods.labs.objects;

class AirplaneController {

    public static void main(String[] args) {

        Airplane myAirplane = new Airplane(1000, "full", 300, "fast", "United", "USA");

        Airline myAirline = new Airline("United", "USA");

        Aircraft myAircraft = new Aircraft("fast");

        Capacity myCapacity = new Capacity(300);

    }
}


class Airplane {

    double fuelCapacity;
    String currentFuelLevel;
    long numPpl;
    String engine;
    String airlineName;
    String baseCountry;

    public Airplane(double fuelCapacity, String currentFuelLevel,
                    long numPpl, String engine, String airlineName, String baseCountry) {

        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.numPpl = numPpl;
        this.engine = engine;
        this.airlineName = airlineName;
        this.baseCountry = baseCountry;
    }


    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                ", numPpl=" + numPpl +
                ", engine='" + engine + '\'' +
                ", airlineName='" + airlineName + '\'' +
                ", baseCountry='" + baseCountry + '\'' +
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

class Aircraft {

    String engine;

    public Aircraft(String engine) {

        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "engine='" + engine + '\'' +
                '}';
    }
}

class Capacity {

    long numPpl;

    public Capacity(long numPpl) {

        this.numPpl = numPpl;

    }

    @Override
    public String toString() {
        return "Capacity{" +
                "numPpl=" + numPpl +
                '}';
    }
}

