package lesson5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры: ");
        System.out.println("1 - Новичок ");
        System.out.println("2 - Любитель ");
        System.out.println("3 - Профессионал ");
        System.out.println("4 - Особый ");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        switch (level) {
            case 1: // когда выбрали Новичок
                int[][] field = new int[9][9];
                // наполнять рандомно минами
                for (int mine = 0; mine < 10; mine++) {
                    // ставим мину
                    int i = ThreadLocalRandom.current().nextInt(0, 8 + 1);

                    int j = ThreadLocalRandom.current().nextInt(0, 8 + 1);
                    if (field[i][j] == -1) { // проверяем есть ли уже там мина
                        mine--; // добавили еще один круг к циклу
                    }
                    field[i][j] = -1;
                }
                // печатаем поле на консоль
                for (int i = 0; i < field.length; i++) {  // генерируем индексы строк
                    for (int j = 0; j < field[i].length; j++) { // генерируем индексы колонок
                        System.out.print(field[i][j] + " ");

                    }
                    System.out.println();
                }
                break;
            case 2: // когда выбрали Любитель
                int[][] field1 = new int[16][16];
                // наполнять рандомно минами
                for (int mine = 0; mine < 40; mine++) {
                    // ставим мину
                    int i = ThreadLocalRandom.current().nextInt(0, 15 + 1);

                    int j = ThreadLocalRandom.current().nextInt(0, 15 + 1);
                    if (field1[i][j] == -1) { // проверяем есть ли уже там мина
                        mine--; // добавили еще один круг к циклу
                    }
                    field1[i][j] = -1;
                }
                // печатаем поле на консоль
                for (int i = 0; i < field1.length; i++) {  // генерируем индексы строк
                    for (int j = 0; j < field1[i].length; j++) { // генерируем индексы колонок
                        System.out.print(field1[i][j] + " ");

                    }
                    System.out.println();
                }
                break;
            case 3:// когда выбрали Профессионал
                int[][] field2 = new int[16][30];
                // наполнять рандомно минами
                for (int mine = 0; mine < 99; mine++) {
                    // ставим мину
                    int i = ThreadLocalRandom.current().nextInt(0, 15 + 1);

                    int j = ThreadLocalRandom.current().nextInt(0, 29 + 1);
                    if (field2[i][j] == -1) { // проверяем есть ли уже там мина
                        mine--; // добавили еще один круг к циклу
                    }
                    field2[i][j] = -1;
                }
                // печатаем поле на консоль
                for (int i = 0; i < field2.length; i++) {  // генерируем индексы строк
                    for (int j = 0; j < field2[i].length; j++) { // генерируем индексы колонок
                        System.out.print(field2[i][j] + " ");

                    }
                    System.out.println();
                }
                break;
            case 4: // когда выбрали Особый.
                System.out.println("Укажите высоту поля: ");
                System.out.println("Укажите ширину поля: ");
                System.out.println("Укажите количество мин: ");


                int fieldHeight = scanner.nextInt();
                int fieldWidth = scanner.nextInt();
                int numberOfMin = scanner.nextInt();


                int[][] field3 = new int[fieldHeight][fieldWidth];
                for (int mine = 0; mine < numberOfMin; mine++) {
                    // ставим мину
                    int i = ThreadLocalRandom.current().nextInt(0, fieldHeight - 1);

                    int j = ThreadLocalRandom.current().nextInt(0, fieldWidth - 1);
                    if (field3[i][j] == -1) { // проверяем есть ли уже там мина
                        mine--; // добавили еще один круг к циклу
                    }
                    field3[i][j] = -1;
                }
                // печатаем поле на консоль
                for (int i = 0; i < field3.length; i++) {  // генерируем индексы строк
                    for (int j = 0; j < field3[i].length; j++) { // генерируем индексы колонок
                        System.out.print(field3[i][j] + " ");

                    }
                    System.out.println();
                }
                break;


        }


    }

}