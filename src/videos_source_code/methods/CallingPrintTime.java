package videos_source_code.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class CallingPrintTime {

    // can call this method from anywhere in the application
    // methods are discreet units of work that you can call over and over again
    // instead of copying and pasting
    // call methods from wherever needed
    public static void main(String[] args) {
        String time = UnderstandingMethods.getCurrentTime();
        System.out.println(time);
    }

}
