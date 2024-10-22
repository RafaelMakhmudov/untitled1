package lesson9.printEditions;

public class Main {
    public static void main(String[] args) {

        PrintIditions[] library = new PrintIditions[5];
        library[0] = new Journal("Натали", 1999, 59,"Москва", 8);
        library[1] = new Journal("Натали", 1998, 78,"Москва", 8);
        library[2] = new Journal("Натали", 1995, 54,"Москва", 8);
        library[3] = new Book("Война и мир", 2010, 500,"Москва", "Толстой");
        library[4] = new Book("Мастер и Маргарита", 2010, 1200,"Москва", "Булгаков");

        PrintIditions theFat = library[0];
        for (PrintIditions pe : library ) {
            if (theFat.getPages() < pe.getPages()) {
                theFat = pe;

            }
        }
        theFat.printInfo(); // проявление полеморфизми
    }

}
