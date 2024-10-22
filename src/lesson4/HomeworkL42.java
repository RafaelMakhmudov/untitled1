package lesson4;

public class HomeworkL42 {


    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                System.out.print(numbers[i]);
            } else {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}