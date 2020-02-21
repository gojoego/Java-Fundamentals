package labs_examples.inheritance.labs;

public class Warren extends Senator {

    String careerBeforeLaw;
    String lawPractice;

    // constructor
    // method for creating object
    public Warren(String party, int yearsActive, String currentOffice, String state, int yearsOffice, String careerBeforeLaw, String lawPractice) {
        super(party, yearsActive, currentOffice, state, yearsOffice);
        this.careerBeforeLaw = careerBeforeLaw;
        this.lawPractice = lawPractice;
    }

    public Warren(String party, int yearsActive, String currentOffice, String state){
        super(party, yearsActive, currentOffice, state);
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
    public static void candidate(){
        System.out.println("I hope Elizabeth Warren wins the Democratic nomination.");
    }
    public static void teacher(){
        System.out.println("Elizabeth Warren's first job after college was teaching " +
                "children with disabilities in a public school. She did this for a year" +
                "before getting her JD at Rutgers.");
    }

    @Override
    public void career() {
        super.career();
    }

    public void definition(){
        System.out.println("slaughterer of Bloomberg");
    }

}
