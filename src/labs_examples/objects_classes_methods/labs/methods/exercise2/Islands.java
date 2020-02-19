package labs_examples.objects_classes_methods.labs.methods.exercise2;

public class Islands {

    private String biggest;
    private String secBiggest;
    private String thirdBiggest;
    private String fourthBiggest;

    public Islands(String biggest, String secBiggest, String thirdBiggest, String fourthBiggest) {
        this.biggest = biggest;
        this.secBiggest = secBiggest;
        this.thirdBiggest = thirdBiggest;
        this.fourthBiggest = fourthBiggest;
    }

    public String getBiggest() {
        return biggest;
    }

    public void setBiggest(String biggest) {
        this.biggest = biggest;
    }

    public String getSecBiggest() {
        return secBiggest;
    }

    public void setSecBiggest(String secBiggest) {
        this.secBiggest = secBiggest;
    }

    public String getThirdBiggest() {
        return thirdBiggest;
    }

    public void setThirdBiggest(String thirdBiggest) {
        this.thirdBiggest = thirdBiggest;
    }

    public String getFourthBiggest() {
        return fourthBiggest;
    }

    public void setFourthBiggest(String fourthBiggest) {
        this.fourthBiggest = fourthBiggest;
    }

    @Override
    public String toString() {
        return "Islands{" +
                "biggest='" + biggest + '\'' +
                ", secBiggest='" + secBiggest + '\'' +
                ", thirdBiggest='" + thirdBiggest + '\'' +
                ", fourthBiggest='" + fourthBiggest + '\'' +
                '}';
    }
}
