package lesson4;

public class HomeworkL41 {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }
    }
}