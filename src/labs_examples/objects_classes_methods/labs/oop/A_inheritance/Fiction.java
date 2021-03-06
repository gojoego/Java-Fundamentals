package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Fiction extends Book {

    String protagonist;
    String antagonist;

    public Fiction() { }

    public Fiction(String protagonist, String antagonist) {
        this.protagonist = protagonist;
        this.antagonist = antagonist;
    }

    public Fiction(int pages, String author, String protagonist, String antagonist) {
        super(pages, author);
        this.protagonist = protagonist;
        this.antagonist = antagonist;
    }

    public void subGenre(String subgenre){
        System.out.println("a subgenre of " + getClass() + " is " + subgenre);
    }

    public void audience(String audience){
        System.out.println("The targeted age group for readers in this category is " + audience);

    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public String getAntagonist() {
        return antagonist;
    }

    public void setAntagonist(String antagonist) {
        this.antagonist = antagonist;
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "protagonist='" + protagonist + '\'' +
                ", antagonist='" + antagonist + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
