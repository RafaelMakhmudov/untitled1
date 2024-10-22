package lesson7.homework7;

// Квадрат
public class Square {

    private int sideSquare;


    public Square() {

    }

    public Square(int sideSquare) {
        this.sideSquare = sideSquare;
    }

    public int getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(int sideSquare) {
        this.sideSquare = sideSquare;
    }

    public void perimeterSquare() {
        System.out.println("Периметр квадрата: " + sideSquare * 4);
    }

    public void areaSquare() {
        System.out.println("Площадь квадрта: " + sideSquare * sideSquare);
    }
}
