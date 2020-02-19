package labs_examples.objects_classes_methods.labs.methods.exercise2;

public class Languages {

    private String primary;
    private String secondary;

    public Languages(String primary, String secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    @Override
    public String toString() {
        return "Languages{" +
                "primary='" + primary + '\'' +
                ", secondary='" + secondary + '\'' +
                '}';
    }
}
