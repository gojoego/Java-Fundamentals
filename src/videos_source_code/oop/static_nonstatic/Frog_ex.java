package videos_source_code.oop.static_nonstatic;

public class Frog_ex {

}

class Main {
    public static void main(String[] args) {
        // create at least 3 distinct frogs below

        Frog hermit = new Frog("Kermit", "Lake");
        Frog prince = new Frog("Prince", "Pond");
        Frog ribbet = new Frog("Ribbet", "Swamp");

        // once all are created, call the toString() on each

        System.out.println(hermit);


        // what printed for numFrogs? why?

    }
}

class Frog {
    String name;
    String habitat;
    static int numFrogs;

    public Frog(String name, String habitat){
        this.name = name;
        this.habitat = habitat;
        numFrogs++;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", numFrogs= " + numFrogs + '\'' +
                '}';
    }
}

