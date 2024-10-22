package lesson7.homework7;

// Прямоугольник
public class Rectangle {

    private int sideRectangleA;
    private int sideRectangleB;

    public Rectangle() {

    }

    public Rectangle(int sideRectangleA, int sideRectangleB) {
        this.sideRectangleA = sideRectangleA;
        this.sideRectangleB = sideRectangleB;
    }

    public int getSideRectangleA() {
        return sideRectangleA;
    }

    public void setSideRectangleA(int sideRectangleA) {
        this.sideRectangleA = sideRectangleA;
    }

    public int getSideRectangleB() {
        return sideRectangleB;
    }

    public void setSideRectangleB(int sideRectangleB) {
        this.sideRectangleB = sideRectangleB;
    }

    public void printPerimeterRectangle() {
        System.out.println("Периметор прямоугольника: " + (sideRectangleA + sideRectangleB) * 2);

    }

    public void printAreaRectangle() {
        System.out.println("Площадь прямоугольника: " + (sideRectangleA * sideRectangleB));
    }
}
