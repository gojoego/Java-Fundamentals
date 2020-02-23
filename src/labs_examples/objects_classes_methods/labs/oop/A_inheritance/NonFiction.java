package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class NonFiction extends Book {

    int sources;
    String topic;

    public NonFiction() {
    }

    public NonFiction(int sources, String topic) {
        this.sources = sources;
        this.topic = topic;
    }

    public NonFiction(int pages, String author, int sources, String topic) {
        super(pages, author);
        this.sources = sources;
        this.topic = topic;
    }

    public int numSources(int numSources){
        return numSources;
    }

    public int getSources() {
        return sources;
    }

    public void setSources(int sources) {
        this.sources = sources;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "NonFiction{" +
                "sources=" + sources +
                ", topic='" + topic + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
