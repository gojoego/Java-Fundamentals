package labs_examples.objects_classes_methods.labs.methods.exercise2;

public class Islands {

    String name;
    Double population;
    String location;

    public Islands(String name, Double population, String location) {
        this.name = name;
        this.population = population;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Islands{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", location='" + location + '\'' +
                '}';
    }
}
