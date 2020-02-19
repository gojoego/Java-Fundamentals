package videos_source_code.methods;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class UnderstandingMethods {
    // public: access modifier
    // static: whether it works on objects or not
    // void: return type
    // void does not return a value
    // main is name of method
    // be descriptive with method naming
    // method parameters or arguments
    // String array arg is the command line
    // argument you can pass into java app


    public static void main(String[] args) {
        // the main method is where every application
        // begins by default
        System.out.println("first we're here");
        String time = getCurrentTime();
        // here you are calling a method
        // when you call the method, it executes that code
        System.out.println("The current time is: " + time);
        System.out.println("now we're finishing up");
        // flow of execution: be mindful of flow when using methods

    }
    // declaring a new method below
    // methods reduce redundancy
    // if you update method, you update everything that uses the method
    public static String getCurrentTime(){
        System.out.println("now we're here printing time");
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        return time;

    }

}
