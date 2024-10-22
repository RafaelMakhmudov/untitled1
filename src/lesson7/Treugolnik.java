package lesson7;

public class Treugolnik {
    public int a;
    public int b;
    public int c;

    // Конструктор
    public Treugolnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;


    }

    public Treugolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void printPerimetr() {
        System.out.println(a + b + c);


    }
}
