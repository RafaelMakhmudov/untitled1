package lesson2;

public class Main2 {


    public static void main(String[] args) {
        // Задача: напечатать на консоль какой вид треугольника по трем сторонам

        int a = 17;
        int b = 17;
        int c = 17;

        if (a != b && b != c && a != c) {
            System.out.println("Это разносторонний треугольник!");

        } else if (a == b && b == c && a == c) {
            System.out.println("Это равносторонний треугольник");

        } else {
            System.out.println("Это равнобедренный треугольник!");
        }


    }
}
