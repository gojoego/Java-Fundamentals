package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Biography extends NonFiction {

    int yearsCovered;
    String subject;

    public Biography(String author, String topic, String subject){
        super.author = author;
        super.topic = topic;
        this.subject = subject;
    }

    public Biography(int yearsCovered, String subject) {
        this.yearsCovered = yearsCovered;
        this.subject = subject;
    }

    public Biography(int sources, String topic, int yearsCovered, String subject) {
        super(sources, topic);
        this.yearsCovered = yearsCovered;
        this.subject = subject;
    }

    public Biography(int pages, String author, int sources, String topic, int yearsCovered, String subject) {
        super(pages, author, sources, topic);
        this.yearsCovered = yearsCovered;
        this.subject = subject;
    }

    @Override
    public int numSources(int numSources){
        return numSources;
    }

    public int getYearsCovered() {
        return yearsCovered;
    }

    public void setYearsCovered(int yearsCovered) {
        this.yearsCovered = yearsCovered;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Biography{" +
                "yearsCovered=" + yearsCovered +
                ", subject='" + subject + '\'' +
                ", sources=" + sources +
                ", topic='" + topic + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
