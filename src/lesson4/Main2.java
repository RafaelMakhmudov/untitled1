package lesson4;

public class Main2 {
    public static void main(String[] args) {
        // Создать массив длинной в 10 элементов
        // и заполнить его четными числами от 20 и далее
        int[] numbers = new int[10];
        numbers[0] = 20;
        numbers[1] = 22;
        numbers[2] = 24; // повторяется 10 раз
        numbers[3] = 26;

        int value =20;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
            value= value+2;
            System.out.println(numbers[i]);



        }
    }
}
