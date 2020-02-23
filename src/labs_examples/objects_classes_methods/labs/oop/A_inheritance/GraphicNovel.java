package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class GraphicNovel extends Fiction {

    String illustrator;
    int issues;

    public GraphicNovel(int pages, String author, String illustrator, int issues){
        super.pages = pages;
        super.author = author;
        this.illustrator = illustrator;
        this.issues = issues;
    }

    public GraphicNovel(String illustrator, int issues) {
        this.illustrator = illustrator;
        this.issues = issues;
    }

    public GraphicNovel(String protagonist, String antagonist, String illustrator, int issues) {
        super(protagonist, antagonist);
        this.illustrator = illustrator;
        this.issues = issues;
    }

    public GraphicNovel(int pages, String author, String protagonist, String antagonist, String illustrator, int issues) {
        super(pages, author, protagonist, antagonist);
        this.illustrator = illustrator;
        this.issues = issues;
    }

    @Override
    public void subGenre(String subgenre){
        System.out.println("a subgenre of " + getClass() + " is " + subgenre);
    }

    @Override
    public void audience(String audience){
        System.out.println("The targeted age group for readers in this category is " + audience);

    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public int getIssues() {
        return issues;
    }

    public void setIssues(int issues) {
        this.issues = issues;
    }

    @Override
    public String toString() {
        return "GraphicNovel{" +
                "illustrator='" + illustrator + '\'' +
                ", issues=" + issues +
                ", protagonist='" + protagonist + '\'' +
                ", antagonist='" + antagonist + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
