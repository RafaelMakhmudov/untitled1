package lesson5;

public class Main2 {
    public static void main(String[] args) {
        // Есть массив 5*5
        // Напечатать только его главную диагональ

        int[][] nums = new int[5][5];
        for (int i = 0; i < nums.length; i++) { //генерируем индексы строк
            for (int j = 0; j < nums.length; j++) {//генерирует индексы колонок
                if ((i + j) == nums.length - 1) { // когда мы печатаем ячейку
                    System.out.print(nums[i][j] + " ");

                }else { // печатаем пустые места все что не диагональ
                    System.out.print(" " + " ");

                }
            }
            System.out.println();
        }
    }
}
