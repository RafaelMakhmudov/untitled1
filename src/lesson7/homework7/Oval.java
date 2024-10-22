package lesson7.homework7;

// Овал
public class Oval {

    private int smallRadius;
    private int bigRadius;

    public Oval() {

    }

    public Oval(int smallRadius, int bigRadius) {
        this.smallRadius = smallRadius;
        this.bigRadius = bigRadius;
    }

    public int getSmallRadius() {
        return smallRadius;
    }

    public void setSmallRadius(int smallRadius) {
        this.smallRadius = smallRadius;
    }

    public int getBigRadius() {
        return bigRadius;
    }

    public void setBigRadius(int bigRadius) {
        this.bigRadius = bigRadius;
    }

    public void ovalCircumference() {
        System.out.println("Длина окружности овала: " + (2 * Math.PI) * (Math.sqrt(((Math.pow(bigRadius, 2) +
                (Math.pow(smallRadius, 2))) / 2))));
    }

    public void ovalArea() {
        System.out.println("Площадь овала: " + smallRadius * bigRadius * Math.PI);
    }
}
