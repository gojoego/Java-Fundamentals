package labs_examples.objects_classes_methods.labs.methods.exercise2;

public class IndonesiaController {
    // using this as the controller class
    // this will be where I declare the main method and create objects

    public static void main(String[] args) {

        Cities major_cities = new Cities("Jakarta",
                "Surabaya", "Medan","Bekasi",
                "Bandung");
        Islands big_islands = new Islands("Sumatra", "Java",
                "Kalimantan", "Sulawesi");
        Languages major_languages = new Languages("Bahasa",
                "Javanese");
        Indonesia profile = new Indonesia(major_cities, big_islands,major_languages,
                264000000.00, "Muslim");

        System.out.println("The capital of Indonesia is " +
                profile.major_cities.getLargest() + ". It is an archipelago " +
                "consisting of over 17,000 islands, with the two largest islands being "
                + profile.biggest_islands.getBiggest() + " and "
                + profile.biggest_islands.getSecBiggest() + ". The primary " +
                "language is " + major_languages.getPrimary() + " and the " +
                "primary religion is " + profile.getReligion() + ".");

    }

}
