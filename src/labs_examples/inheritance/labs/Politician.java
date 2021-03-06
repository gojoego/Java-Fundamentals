package labs_examples.inheritance.labs;

public class Politician {

    String party;
    int yearsActive;
    String currentOffice;

    public Politician(String party, int yearsActive, String currentOffice) {
        this.party = party;
        this.yearsActive = yearsActive;
        this.currentOffice = currentOffice;
    }

    public Politician() {
    }

    public Politician(String party, int yearsActive){
        this.party = party;
        this.yearsActive = yearsActive;
    }

    public Politician(String party) {
        this.party = party;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }

    public String getCurrentOffice() {
        return currentOffice;
    }

    public void setCurrentOffice(String currentOffice) {
        this.currentOffice = currentOffice;
    }

    @Override
    public String toString() {
        return "Politician{" +
                "party='" + party + '\'' +
                ", yearsActive=" + yearsActive +
                ", currentOffice='" + currentOffice + '\'' +
                '}';
    }

    public void career(){
        System.out.println("Most politicians begin their careers in Law.");
    }

    public void definition(){
        System.out.println("a person who is professionally involved in politics, " +
                "especially as a holder of or a candidate for an elected office.");
    }
}
