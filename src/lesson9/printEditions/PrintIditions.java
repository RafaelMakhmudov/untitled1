package lesson9.printEditions;

public abstract class PrintIditions {
    private String nazvanie;
    private int year;
    private int pages;
    private String izdatelstvo;

    public PrintIditions() {

    }

    public PrintIditions(String nazvanie, int year, int pages, String izdatelstvo) {
        this.nazvanie = nazvanie;
        this.year = year;
        this.pages = pages;
        this.izdatelstvo = izdatelstvo;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }
    public abstract void printInfo();
}

