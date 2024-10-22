package lesson9.printEditions;

public class Book extends PrintIditions {
    private String author;

    public Book() {

    }

    @Override
    public void printInfo() {
        System.out.println("Книга " + getNazvanie() + "Количество страниц: " + getPages());
    }

    public Book(String nazvanie, int year, int pages, String izdatelstvo, String author) {
        super(nazvanie, year, pages, izdatelstvo);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

