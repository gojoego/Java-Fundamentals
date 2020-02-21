package labs_examples.inheritance.labs;

public class Senator extends Politician {

    String state;
    int yearsOffice;

    public Senator(String party, int yearsActive, String currentOffice, String state, int yearsOffice) {
        super(party, yearsActive, currentOffice);
        this.state = state;
        this.yearsOffice = yearsOffice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getYearsOffice() {
        return yearsOffice;
    }

    public void setYearsOffice(int yearsOffice) {
        this.yearsOffice = yearsOffice;
    }

    @Override
    public String toString() {
        return "Senator{" +
                "state='" + state + '\'' +
                ", yearsOffice=" + yearsOffice +
                '}';
    }
}
