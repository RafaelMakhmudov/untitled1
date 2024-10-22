package lesson9.printEditions;

public class Journal extends PrintIditions{
    private int numberOFYear;

    public Journal() {

    }

    @Override
    public void printInfo() {
        System.out.println("Журнал " + getNazvanie() + "Количество страниц: " + getPages());
    }

    public Journal(String nazvanie, int year, int pages, String izdatelstvo, int numberOFYear) {
        super(nazvanie, year, pages, izdatelstvo);
        this.numberOFYear = numberOFYear;
    }

    public int getNumberOFYear() {
        return numberOFYear;
    }

    public void setNumberOFYear(int numberOFYear) {
        this.numberOFYear = numberOFYear;
    }
}
