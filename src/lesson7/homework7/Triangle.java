package lesson7.homework7;

// Треугольник
public class Triangle {

    private int sideTriangleA;
    private int sideTriangleB;
    private int sideTriangleC;

    public Triangle() {

    }

    public Triangle(int sideTriangleA, int sideTriangleB, int sideTriangleC) {
        this.sideTriangleA = sideTriangleA;
        this.sideTriangleB = sideTriangleB;
        this.sideTriangleC = sideTriangleC;
    }

    public int getSideTriangleA() {
        return sideTriangleA;
    }

    public void setSideTriangleA(int sideTriangleA) {
        this.sideTriangleA = sideTriangleA;
    }

    public int getSideTriangleB() {
        return sideTriangleB;
    }

    public void setSideTriangleB(int sideTriangleB) {
        this.sideTriangleB = sideTriangleB;
    }

    public int getSideTriangleC() {
        return sideTriangleC;
    }

    public void setSideTriangleC(int sideTriangleC) {
        this.sideTriangleC = sideTriangleC;
    }

    public void printPerimeter() {
        System.out.println("Периметр треугольника: "+(sideTriangleA + sideTriangleB + sideTriangleC));


    }

    public void printSquare() {
        System.out.println("Площадь треугольника: " + Math.sqrt(((sideTriangleA + sideTriangleB + sideTriangleC) / 2) *
                (((sideTriangleA + sideTriangleB + sideTriangleC) / 2) - sideTriangleA) *
                (((sideTriangleA + sideTriangleB + sideTriangleC) / 2) - sideTriangleB) *
                (((sideTriangleA + sideTriangleB + sideTriangleC) / 2) - sideTriangleC)));


    }
}
