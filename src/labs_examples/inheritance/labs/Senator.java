package labs_examples.inheritance.labs;

public class Senator extends Politician {

    String state;
    int yearsOffice;

    public Senator(String party, int yearsActive, String currentOffice, String state, int yearsOffice) {
        super(party, yearsActive, currentOffice);
        this.state = state;
        this.yearsOffice = yearsOffice;
    }

    public Senator(String party, int yearsActive, String currentOffice) {
        super(party, yearsActive, currentOffice);
    }

    public Senator() {
    }
    
    public Senator(String party, int yearsActive ){
        super.party = party;
        super.yearsActive = yearsActive;
    }

    public Senator(String party, int yearsActive, String currentOffice, String state) {
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

    public static void usSenate(){
        System.out.println("There 100 US Senators, two from each of the 50 states.");
    }

}
