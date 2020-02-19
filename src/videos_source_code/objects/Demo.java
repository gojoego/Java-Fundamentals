package videos_source_code.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Demo {

    public static void main(String[] args) {

        // object composition: composing object from other objects
        Oven myOven = new Oven(true, 500, "GE");
        // This code creates an object called myOven from the Oven class.
        // The NEW myOven object has 3 parameters that have been set
        // utilizing constructors in the Oven class. The gasRange is "true"(String).
        // The maxTemp is 500(integer). The brand is "GE"(String).
        // This is a POJO.

        Dishwasher dishwasher = new Dishwasher(true, "GE", 5);
        // Here we are creating an object called dishwasher of the Dishwasher type.
        // We are passing the parameters onto the object.
        // This is a POJO.

        Refigerator fridge = new Refigerator(true, "Kenmore", 150);
        // This is a POJO.

        Sink sink = new Sink(true, "sinkBrand", "stainless steel");
        // This is a POJO.

        Kitchen myKitchen = new Kitchen(dishwasher, myOven, fridge, sink);
        // Kitchen "has a" dishwasher, oven, fridge, and sink.
        // Kitchen object created from 4 other objects

//        System.out.println("My kitchen has a " + myKitchen.getOven().getBrand() + " oven " +
//                "with a max temp of " + myKitchen.getOven().getMaxTemp());

        System.out.println(myKitchen.toString());
        // object composition

    }

}
