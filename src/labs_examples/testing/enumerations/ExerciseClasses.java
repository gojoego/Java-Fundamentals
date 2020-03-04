package labs_examples.testing.enumerations;

public enum ExerciseClasses {

    YOGA("Kim", "8am"),
    HIIT("Marcella","9am"),
    STRENGTH("Isadora","10am"),
    CARDIO("Ryan","7am");

    private String name;
    private String time;

    ExerciseClasses(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

