package labs_examples.objects_classes_methods.labs.methods.exercise2;
/*

This is my POJO for Cities in Indonesia. I'm declaring 5 private String variables and have
included their corresponding constructors and getters and setters and the toString.

 */
public class Cities {

    private String largest;
    private String secLargest;
    private String thirdLargest;
    private String fourthLargest;
    private String fifthLargest;

    public Cities(String largest, String secLargest, String thirdLargest, String fourthLargest, String fifthLargest) {
        this.largest = largest;
        this.secLargest = secLargest;
        this.thirdLargest = thirdLargest;
        this.fourthLargest = fourthLargest;
        this.fifthLargest = fifthLargest;
    }

    public String getLargest() {
        return largest;
    }

    public void setLargest(String largest) {
        this.largest = largest;
    }

    public String getSecLargest() {
        return secLargest;
    }

    public void setSecLargest(String secLargest) {
        this.secLargest = secLargest;
    }

    public String getThirdLargest() {
        return thirdLargest;
    }

    public void setThirdLargest(String thirdLargest) {
        this.thirdLargest = thirdLargest;
    }

    public String getFourthLargest() {
        return fourthLargest;
    }

    public void setFourthLargest(String fourthLargest) {
        this.fourthLargest = fourthLargest;
    }

    public String getFifthLargest() {
        return fifthLargest;
    }

    public void setFifthLargest(String fifthLargest) {
        this.fifthLargest = fifthLargest;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "largest='" + largest + '\'' +
                ", secLargest='" + secLargest + '\'' +
                ", thirdLargest='" + thirdLargest + '\'' +
                ", fourthLargest='" + fourthLargest + '\'' +
                ", fifthLargest='" + fifthLargest + '\'' +
                '}';
    }
}
