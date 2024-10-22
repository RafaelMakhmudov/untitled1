package lesson12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray= {"hello", "world", "java" };
        System.out.println(wordsArray[1]);
// Верхний массив можно записаь и так:
        String[] wordsArray2= new String[3];
        wordsArray2[0]="hello";
        wordsArray2[1]="world";
        wordsArray2[2]="java";
        System.out.println(wordsArray2[1]);

        List<String> wordsList = new ArrayList<>();
        wordsList.add("hello");
        wordsList.add("world");
        wordsList.add("java");

        wordsList.set(1, "home");
        System.out.println(wordsList.size());



    }
}
