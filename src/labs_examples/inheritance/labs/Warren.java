package labs_examples.inheritance.labs;

public class Warren extends Senator {

    String careerBeforeLaw;
    String lawPractice;

    public Warren(String party, int yearsActive, String currentOffice, String state, int yearsOffice, String careerBeforeLaw, String lawPractice) {
        super(party, yearsActive, currentOffice, state, yearsOffice);
        this.careerBeforeLaw = careerBeforeLaw;
        this.lawPractice = lawPractice;
    }

    public String getCareerBeforeLaw() {
        return careerBeforeLaw;
    }

    public void setCareerBeforeLaw(String careerBeforeLaw) {
        this.careerBeforeLaw = careerBeforeLaw;
    }

    public String getLawPractice() {
        return lawPractice;
    }

    public void setLawPractice(String lawPractice) {
        this.lawPractice = lawPractice;
    }

    @Override
    public String toString() {
        return "Warren{" +
                "careerBeforeLaw='" + careerBeforeLaw + '\'' +
                ", lawPractice='" + lawPractice + '\'' +
                '}';
    }
}
