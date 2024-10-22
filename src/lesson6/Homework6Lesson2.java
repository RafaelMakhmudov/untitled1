package lesson6;

import java.util.Locale;

public class Homework6Lesson2 {
    public static void main(String[] args) {
        // Напечатать на консоль количество гласных букв в тексте
        String text = "Я буду учиться лучше и лучше";
        int count = 0;
        for (char c : text.toLowerCase().toCharArray()) {

            if ("аеёиоуыэюя".indexOf(c) != -1) {
                count++;

            }


        }
        System.out.println("Количество гласных: " + count);

    }
}

