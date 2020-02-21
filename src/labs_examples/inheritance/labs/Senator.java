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

    public void definition(){
        System.out.println("a member of a senate");
    }

    public int percentLifeInOffice(int yearsOffice, int age){
        return yearsOffice/age;
    }
    public int averageAge(int age1, int age2, int age3){
        return (age1 + age2 + age3)/3;
    }
    public int averageAge(int age1, int age2) {
        return (age1 + age2) / 2;
    }
}
