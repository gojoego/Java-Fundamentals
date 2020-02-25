package videos_source_code.oop.static_nonstatic.variables;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class House {

    int squareFeet;
    String address;
    static int numHousesBuilt;
    // every object of class has access to same single
    // unique variable in memory

    public House(int squareFeet, String address) {
        this.squareFeet = squareFeet;
        this.address = address;
        numHousesBuilt++;
        // incrementing every time constructor called
        // static instance variables are shared
    }

    @Override
    public String toString() {
        return "House{" +
                "squareFeet=" + squareFeet +
                ", address='" + address + '\'' +
                ", numHousesBuild= " + numHousesBuilt + '}';
    }
}
