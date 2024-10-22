package lesson7.homework7;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5);
        triangle.printPerimeter();
        triangle.printSquare();

        Square square = new Square(5);
        square.perimeterSquare();
        square.areaSquare();

        Rectangle rectangle = new Rectangle(5,10);
        rectangle.printPerimeterRectangle();
        rectangle.printAreaRectangle();

        Oval oval = new Oval(5,7);
        oval.ovalCircumference();
        oval.ovalArea();

        Circle circle = new Circle(8);
        circle.Circumference();
        circle.Area();


    }
}
