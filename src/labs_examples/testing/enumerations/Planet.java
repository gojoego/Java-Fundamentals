package labs_examples.testing.enumerations;

// use enums for sets that are not going to change

public enum Planet {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    private int orderFromSun;

    Planet(int orderFromSun) {
        this.orderFromSun = orderFromSun;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public void setOrderFromSun(int orderFromSun) {
        this.orderFromSun = orderFromSun;
    }
}
