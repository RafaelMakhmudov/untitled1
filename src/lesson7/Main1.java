package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Treugolnik treug1 = new Treugolnik(5, 6,8);
//        treug1.setA(5);
//        treug1.setB(6);
//        treug1.setC(8);


        System.out.println(treug1.getA());
        treug1.printPerimetr();
    }
}