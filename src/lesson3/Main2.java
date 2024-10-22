package lesson3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // напишем программу, которая будет у пользователя (пользователь это мы)
        // спрашивать какую фигуру мы хотим посчитать, треугольник, овал, квадрат, прямоугольник, круг)
        // Программа запросит у нас ввести все необходимые данные о фигуре
        // и далее выведет на консоль ПЛОЩАДЬ и ПЕРИМЕТР этих фигур
        System.out.println("Выберите фигуру:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - овал");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Прямоугольник");
        System.out.println("5 - Круг");
        // Scanner - тип, описывает "считыватель" информации с источника
        // Формула созданная ЛЮБОГО объекта(все то что есть не примитивный тип)
        Scanner scanner = new Scanner(System.in);
        int selectFigura = scanner.nextInt();
        //управляющая конструкция (if     swich)
        switch (selectFigura) {
            case 1: // Если пользователь выбрал Треугольник
                System.out.println("Введите сторону А:");
                int a = scanner.nextInt();
                System.out.println("Введите сторону В: ");
                int b = scanner.nextInt();
                System.out.println("Введите сторону С: ");
                int c = scanner.nextInt();
                double semiperimeter = (a + b + c) / 2;
                double areaOfATriangle = (Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)));


                System.out.println("Периметр треугольника:" + (a + b + c) + "Площадь треугольника:" + areaOfATriangle);
                break;


            case 2: // если пользователь выбрал Овал
                System.out.println("Введите малый радиус:");
                int r1 = scanner.nextInt();
                System.out.println("Введите большой радиус:");
                int r2 = scanner.nextInt();
                double OvalPerimeter = 2 * Math.PI * Math.sqrt(((r1 * r1) + (r2 * r2)) / 2);
                double OvalArea = r1 * r2 * Math.PI;
                System.out.println("Периметр Овала:" + OvalPerimeter + "Площадь Овала:" + OvalArea);
                break;

            case 3:// если пользователь выбрал Квадрат
                System.out.println("Введите длину стороны:");
                int r3 = scanner.nextInt();
                double perimeterOfASquare = r3 * 2;
                double areaOfASquare = r3 * r3;
                System.out.println("Периметр квадрата:" + perimeterOfASquare + "Площадь квадрата:" + areaOfASquare);
                break;
            case 4: // если пользователь выбрал прямоугольник
                System.out.println("Введите сторону А:");
                int r4 = scanner.nextInt();
                System.out.println("Введите сторону В:");
                int r5 = scanner.nextInt();
                int perimeterOfARectangle = ((r4 + r5) * 2);
                int areaOfARectangle = r4 * r5;
                System.out.println("Периметр прямоугольника: +" + perimeterOfARectangle + "Площадь прямоугольника:" + areaOfARectangle);
                break;
                case 5: // если пользователь выбрал круг
                    System.out.println("Введите радиус:");
                    int r6 = scanner.nextInt();
                    double perimeterOfACircle = (2*Math.PI*r6);
                    double areaOfACircle = (r6 * r6)*Math.PI;
                    System.out.println("Периметр круга:" + perimeterOfACircle + "Площадь круга:" + areaOfACircle);
                    break;


        }

    }

}