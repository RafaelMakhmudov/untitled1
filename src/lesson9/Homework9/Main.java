package lesson9.Homework9;

public class Main {
    public static void main(String[] args) {
        HenFactoru henFactoru = new HenFactoru();

        Hen russianHen = henFactoru.getHen("Россия");
        System.out.println(russianHen.getDescription());

        Hen ukrainianHen = henFactoru.getHen("Украина");
        System.out.println(ukrainianHen.getDescription());

        Hen moldovanHen = henFactoru.getHen("Молдова");
        System.out.println(moldovanHen.getDescription());

        Hen belarusianHen = henFactoru.getHen("Беларусь");
        System.out.println(belarusianHen.getDescription());
    }
}


