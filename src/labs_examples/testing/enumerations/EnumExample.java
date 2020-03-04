package labs_examples.testing.enumerations;

public class EnumExample {

    public static void main(String[] args) {

        Planet earth = Planet.EARTH;

        System.out.println("Earth order from the sun is " + earth.getOrderFromSun());

        Planet jupiter = Planet.JUPITER;
        System.out.println("Jupiter order from the sun is " + jupiter.getOrderFromSun());

        Planet pluto = Planet.PLUTO;
        System.out.println("Pluto order from the sun is " + pluto.getOrderFromSun());

    }
}
