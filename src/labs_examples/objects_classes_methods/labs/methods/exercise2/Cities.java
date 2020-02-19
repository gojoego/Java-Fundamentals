package labs_examples.objects_classes_methods.labs.methods.exercise2;

public class Cities {

    String name;
    double population;

    public Cities(String name, double population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
