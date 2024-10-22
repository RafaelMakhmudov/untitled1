package lesson6;

public class Homework6Lesson {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше и лучше";
        String column = text.replace(" ", "\n");
        System.out.println(column);

        String reverse = new StringBuilder(text).reverse().toString();
        System.out.println(reverse);





    }
}
