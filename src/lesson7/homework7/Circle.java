package lesson7.homework7;

// Круг
public class Circle {

    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void Circumference() {
        System.out.println("Длинна окружности: " + this.radius * 2 * Math.PI);

    }

    public void Area() {
        System.out.println("Площадь круга: " + Math.pow(this.radius,2) * Math.PI);
    }

}
