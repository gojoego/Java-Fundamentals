package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.PrintMedia;

public class Book implements PrintMedia {

    int pages;
    String author;

    public Book(){}

    public Book(int pages, String author) {
        this.pages = pages;
        this.author = author;
    }

    public void getTitle(String title) {
        System.out.println("The title of this book is " + title + ".");
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void publish() {

    }

    @Override
    public void distribute() {

    }

    @Override
    public void rightsToFilm() {

    }
}
