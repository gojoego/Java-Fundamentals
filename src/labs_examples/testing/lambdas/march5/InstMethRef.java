package labs_examples.testing.lambdas.march5;

public class InstMethRef {
    public static void main(String[] args) {

        Friends justin = new Friends("Justin","Caucasian");
        Relationships bestie = justin::intro;
        bestie.profile();

    }
}

class Friends{
    String name;
    String ethnicity;

    public Friends(String name, String ethnicity) {
        this.name = name;
        this.ethnicity = ethnicity;
    }

    public void intro(){
        System.out.println("My friend " + name
        + " is " + ethnicity + ".");
    }

}

@FunctionalInterface
interface Relationships{
    void profile();
}

