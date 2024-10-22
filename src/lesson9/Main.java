package lesson9;

public class Main {
    public static void main(String[] args) {
        Tcvetok tcvetok1 = new Tcvetok();
        Tcvetok tcvetok2 = new Tcvetok();
        Derevo derevo1 = new Derevo();
        Derevo derevo2 = new Derevo();

        Rastenie[] sad = new Rastenie[4];
        sad[0] = derevo1;
        sad[1] = derevo2;
        sad[2] = tcvetok2;
        sad[3] = tcvetok1;

        for (Rastenie r : sad) {
            r.printInfo(); // Проявление полиморфизма!!!

        }


    }
}
