package labs_examples.objects_classes_methods.labs.objects;

import com.sun.corba.se.impl.oa.poa.AOMEntry;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

// this is the controller
class AirplaneController {

    public static void main(String[] args) {

        Airplane bali = new Airplane(100, "Full", "United", "Texas", "Turbo", 200);

        System.out.println(bali.toString());


    }
}


class Airplane {

    double fuelCapacity;
    String currentFuelLevel;
    String airlineName;
    String baseCountry;
    String engine;
    long capacity;

    public Airplane(double fuelCapacity, String currentFuelLevel, String airlineName, String baseCountry, String engine, long capacity) {
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


// is this association???

class AircraftCapacity {
    Aircraft a = new Aircraft("Fast");
    Capacity c = new Capacity(200);

    public AircraftCapacity(Aircraft a, Capacity c) {
        this.a = a;
        this.c = c;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

