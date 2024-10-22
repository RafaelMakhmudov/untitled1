package lesson5;

public class Main3 {
    public static void main(String[] args) {
        // вывести на консоль нолики в виде шамотной доски


        int[][] nums = new int[8][8];
        for (int i = 0; i < nums.length; i++) { //генерируем индексы строк
            for (int j = 0; j < nums.length; j++) {//генерирует индексы колонок
                if ((i + j) % 2 == 0) { // когда мы печатаем ячейку
                    System.out.print(nums[i][j] + " ");

                } else { // печатаем пустые места все что не диагональ
                    System.out.print(" " + " ");

                }
            }
            System.out.println();
        }
    }
}
